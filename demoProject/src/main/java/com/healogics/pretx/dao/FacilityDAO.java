package com.healogics.pretx.dao;

import com.healogics.pretx.domain.Facility;

public interface FacilityDAO {

	Facility getFacilityById(Long facilityId);

	void save(Facility facility);

	void coversheetFacility(Facility facilty);

}
