package com.healogics.pretx.dao;

import java.time.LocalDate;
import java.util.List;

import com.healogics.pretx.domain.Request;
import com.healogics.pretx.domain.RequestDetail;
import com.healogics.pretx.domain.RequestLifeCycle;
import com.healogics.pretx.domain.User;

public interface RequestDAO {

	Request get(Long id);

	void saveRequestDetails(RequestDetail requestDetail);

	Request getRequestByPatientId(Long patientId);

	Long saveRequestData(Request request);

	User getUserList(Long patientId);

	RequestDetail getRquestDetailByRequestId(Long requestid);

	User getUserListByHspId(Long hspid);

	void deleteRequestById(Long id);

	List<Request> getDashboard(int offset, String column, char order, List<Short> status, LocalDate fromDate,
			LocalDate toDate, List<Long> hspIds);

	List<Object> getHboDashboardCount(List<Short> status, LocalDate fromDate, LocalDate toDate, List<Long> hspIds);

	List<Object> getFacilityDashboardCount(List<Short> status, LocalDate fromDate, LocalDate toDate, List<Long> hspIds,
			List<Long> facilityIds);

	void updateRequestData(Request request);

	void deleteRequestDetail(Long requestId);

	void saveRequestLifeCycle(RequestLifeCycle lifeCycle);

	List<Request> getFacilityDashboard(int offset, String column, char order, List<Short> status, LocalDate fromDate,
			LocalDate toDate, List<Long> hspIds, List<Long> facilityIds);

	Long getAnyActiveRequestByPatient(Long patientId);

	List<Request> patientDashboard(int offset, String column, char order, List<Short> status, Long patientId);

	User getPatientDetailByRequestId(Long requestId);

}
