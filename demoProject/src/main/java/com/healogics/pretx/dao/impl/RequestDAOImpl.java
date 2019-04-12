package com.healogics.pretx.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healogics.pretx.dao.RequestDAO;
import com.healogics.pretx.domain.Request;
import com.healogics.pretx.domain.RequestDetail;
import com.healogics.pretx.domain.RequestLifeCycle;
import com.healogics.pretx.domain.User;
import com.healogics.pretx.enumeration.RequestStatus;
import com.healogics.pretx.utility.Constants;

@Transactional
@Repository
public class RequestDAOImpl implements RequestDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Request get(Long id) {
		return this.sessionFactory.getCurrentSession().get(Request.class, id);
	}

	@Override
	public void saveRequestDetails(RequestDetail requestDetail) {
		this.sessionFactory.getCurrentSession().save(requestDetail);
	}

	@Override
	public Long saveRequestData(Request request) {
		return (Long) this.sessionFactory.getCurrentSession().save(request);
	}

	@Override
	public void saveRequestLifeCycle(RequestLifeCycle lifeCycle) {
		this.sessionFactory.getCurrentSession().save(lifeCycle);
	}

	@Override
	public void updateRequestData(Request request) {
		this.sessionFactory.getCurrentSession().update(request);
	}

	@Override
	public User getUserList(Long patientId) {
		return this.sessionFactory.getCurrentSession().get(User.class, patientId);
	}

	@Override
	public Request getRequestByPatientId(Long patientId) {
		return (Request) this.sessionFactory.getCurrentSession()
				.createQuery("From Request where patientid=:patientid and isDeleted=FALSE")
				.setParameter("patientid", patientId).uniqueResult();
	}

	@Override
	public RequestDetail getRquestDetailByRequestId(Long requestid) {
		return (RequestDetail) this.sessionFactory.getCurrentSession()
				.createQuery("From RequestDetail rd where rd.request.id=:requestid and rd.isDeleted is false")
				.setParameter("requestid", requestid).uniqueResult();
	}

	@Override
	public User getUserListByHspId(Long hspid) {
		return this.sessionFactory.getCurrentSession().get(User.class, hspid);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void deleteRequestDetail(Long requestId) {
		String hql = "UPDATE RequestDetail rd SET rd.isDeleted = true WHERE rd.request.id=:id and rd.isDeleted is false";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("id", requestId);
		query.executeUpdate();
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void deleteRequestById(Long id) {
		String hql = "UPDATE Request SET isDeleted=TRUE WHERE id=:id";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Request> getDashboard(int offset, String column, char order, List<Short> status, LocalDate fromDate,
			LocalDate toDate, List<Long> hspIds) {

		StringBuffer hql = new StringBuffer(
				"SELECT req FROM Request req INNER JOIN req.user patient INNER JOIN req.hsp hsp INNER JOIN req.facility facility LEFT JOIN req.reviewedBy reviewedBy WHERE req.isDeleted=FALSE and req.status IN(:status) ");

		if (fromDate != null)
			hql.append(" AND DATE(req.submitedDate) >= '").append(fromDate).append("'");

		if (toDate != null)
			hql.append(" AND DATE(req.submitedDate) <= '").append(toDate).append("'");

		if (hspIds != null && !hspIds.isEmpty())
			hql.append(" AND hsp.id IN (:hspIds)");

		hql.append(" ORDER BY ");

		if (column.equalsIgnoreCase("requested"))
			hql.append("req.submitedDate");

		else if (column.equalsIgnoreCase("name"))
			hql.append("patient.lastName ").append((order == 'a' ? " asc" : " desc")).append(" , patient.firstName");

		else if (column.equalsIgnoreCase("hsp"))
			hql.append("hsp.lastName ").append((order == 'a' ? " asc" : " desc")).append(" , hsp.firstName");

		else if (column.equalsIgnoreCase("reviewed"))
			hql.append("reviewedBy.lastName ").append((order == 'a' ? " asc" : " desc"))
					.append(" , reviewedBy.firstName");

		else if (column.equalsIgnoreCase("facility"))
			hql.append(" facility.name ");

		if (order == 'a')
			hql.append(" asc NULLS LAST");
		else
			hql.append(" desc NULLS LAST");

		Query<Request> query = this.sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(offset);
		query.setMaxResults(Constants.PAGE_SIZE + 1);
		query.setParameterList("status", status);

		if (hspIds != null && !hspIds.isEmpty())
			query.setParameterList("hspIds", hspIds);
		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Request> patientDashboard(int offset, String column, char order, List<Short> status, Long patientId) {

		StringBuffer hql = new StringBuffer(
				"SELECT req FROM Request req INNER JOIN req.user patient INNER JOIN req.hsp hsp INNER JOIN req.facility facility LEFT JOIN req.reviewedBy reviewedBy WHERE req.isDeleted=FALSE and req.status IN(:status) AND patient.id=:patientId ORDER BY  ");

		if (column.equalsIgnoreCase("requested"))
			hql.append("req.submitedDate");

		if (order == 'a')
			hql.append(" asc NULLS LAST");
		else
			hql.append(" desc NULLS LAST");

		Query<Request> query = this.sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(offset);
		query.setMaxResults(Constants.PAGE_SIZE + 1);
		query.setParameterList("status", status);
		query.setParameter("patientId", patientId);

		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Request> getFacilityDashboard(int offset, String column, char order, List<Short> status,
			LocalDate fromDate, LocalDate toDate, List<Long> hspIds, List<Long> facilityIds) {

		StringBuffer hql = new StringBuffer(
				"SELECT req FROM Request req INNER JOIN req.user patient INNER JOIN req.hsp hsp INNER JOIN req.facility facility LEFT JOIN req.reviewedBy reviewedBy WHERE req.isDeleted=FALSE and req.status IN(:status) AND facility.id IN (:facilityIds) ");

		if (fromDate != null)
			hql.append(" AND DATE(req.submitedDate) >= '").append(fromDate).append("'");

		if (toDate != null)
			hql.append(" AND DATE(req.submitedDate) <= '").append(toDate).append("'");

		if (hspIds != null && !hspIds.isEmpty())
			hql.append(" AND hsp.id IN (:hspIds)");

		hql.append(" ORDER BY ");

		if (column.equalsIgnoreCase("requested"))
			hql.append("req.submitedDate");

		else if (column.equalsIgnoreCase("hsp"))
			hql.append("hsp.lastName ").append((order == 'a' ? " asc" : " desc")).append(" , hsp.firstName");

		else if (column.equalsIgnoreCase("name"))
			hql.append("patient.lastName ").append((order == 'a' ? " asc" : " desc")).append(" , patient.firstName");

		else if (column.equalsIgnoreCase("reviewed"))
			hql.append("reviewedBy.lastName ").append((order == 'a' ? " asc" : " desc"))
					.append(" , reviewedBy.firstName");

		else if (column.equalsIgnoreCase("facility"))
			hql.append(" facility.name ");

		if (order == 'a')
			hql.append(" asc NULLS LAST");
		else
			hql.append(" desc NULLS LAST");

		Query<Request> query = this.sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(offset);
		query.setMaxResults(Constants.PAGE_SIZE + 1);
		query.setParameterList("status", status);
		query.setParameterList("facilityIds", facilityIds);

		if (hspIds != null && !hspIds.isEmpty())
			query.setParameterList("hspIds", hspIds);
		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getHboDashboardCount(List<Short> status, LocalDate fromDate, LocalDate toDate,
			List<Long> hspIds) {

		StringBuffer hql = new StringBuffer(
				"Select req.status, count(req.id) FROM Request req INNER JOIN req.hsp hsp INNER JOIN req.facility facility where req.isDeleted = false and req.status IN(:status) ");

		if (fromDate != null)
			hql.append(" AND DATE(req.submitedDate) >= '").append(fromDate).append("'");

		if (toDate != null)
			hql.append(" AND DATE(req.submitedDate) <= '").append(toDate).append("'");

		if (hspIds != null && !hspIds.isEmpty())
			hql.append(" AND hsp.id IN (:hspIds)");

		hql.append(" group by req.status ");

		Query<Object> query = this.sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setParameterList("status", status);

		if (hspIds != null && !hspIds.isEmpty())
			query.setParameterList("hspIds", hspIds);

		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getFacilityDashboardCount(List<Short> status, LocalDate fromDate, LocalDate toDate,
			List<Long> hspIds, List<Long> facilityIds) {

		StringBuffer hql = new StringBuffer(
				"Select req.status, count(req.id) FROM Request req INNER JOIN req.hsp hsp INNER JOIN req.facility facility where req.isDeleted = false and req.status IN(:status) AND facility.id IN (:facilityIds) ");

		if (fromDate != null)
			hql.append(" AND DATE(req.submitedDate) >= '").append(fromDate).append("'");

		if (toDate != null)
			hql.append(" AND DATE(req.submitedDate) <= '").append(toDate).append("'");

		if (hspIds != null && !hspIds.isEmpty())
			hql.append(" AND hsp.id IN (:hspIds)");

		hql.append(" group by req.status ");

		Query<Object> query = this.sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setParameterList("facilityIds", facilityIds);
		query.setParameterList("status", status);

		if (hspIds != null && !hspIds.isEmpty())
			query.setParameterList("hspIds", hspIds);

		return query.list();
	}

	@Override
	public Long getAnyActiveRequestByPatient(Long patientId) {

		String hql = "select r.id from Request r where r.user.id = :patientId and r.status in (:status) order by r.id desc";

		List<Short> status = new ArrayList<>();
		status.add(RequestStatus.DRAFT.value());
		status.add(RequestStatus.APPROVED.value());
		status.add(RequestStatus.DECLINED.value());
		status.add(RequestStatus.INREVIEW.value());
		status.add(RequestStatus.NEW.value());
		status.add(RequestStatus.RESUBMITED.value());
		status.add(RequestStatus.RETURNED.value());

		return (Long) this.sessionFactory.getCurrentSession().createQuery(hql).setParameter("patientId", patientId)
				.setParameterList("status", status).setMaxResults(1).uniqueResult();
	}

	@Override
	public User getPatientDetailByRequestId(Long requestId) {

		return (User) this.sessionFactory.getCurrentSession()
				.createQuery("select r.user From Request r where r.id=:requestId and r.isDeleted=FALSE")
				.setParameter("requestId", requestId).uniqueResult();

	}

}
