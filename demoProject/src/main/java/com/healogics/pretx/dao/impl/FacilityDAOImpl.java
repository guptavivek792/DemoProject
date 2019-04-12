package com.healogics.pretx.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healogics.pretx.dao.FacilityDAO;
import com.healogics.pretx.domain.Facility;

@Transactional
@Repository
public class FacilityDAOImpl implements FacilityDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Facility facility) {
		this.sessionFactory.getCurrentSession().save(facility);
	}

	@Override
	public Facility getFacilityById(Long facilityId) {

		String hql = "from Facility f where f.facilityId = :facilityId";

		Query<Facility> query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setMaxResults(1);
		query.setParameter("facilityId", facilityId);

		return query.uniqueResult();
	}

	@Override
	public void coversheetFacility(Facility facility) {

		this.sessionFactory.getCurrentSession().update(facility);

	}

}
