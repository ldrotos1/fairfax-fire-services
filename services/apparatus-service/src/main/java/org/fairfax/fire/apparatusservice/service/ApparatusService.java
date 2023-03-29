package org.fairfax.fire.apparatusservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.fairfax.fire.apparatusservice.dao.ApparatusDao;
import org.fairfax.fire.apparatusservice.mapper.ApparatusMapper;
import org.fairfax.fire.models.Apparatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApparatusService {

	@Autowired
	private ApparatusDao apparatusDao;
	
	public List<Apparatus> getApparatusAssignedToFacility(String facilityNumber) {
		return apparatusDao.findByAssignedLocation(facilityNumber).stream()
				.map(ApparatusMapper::mapEntityToModel)
				.collect(Collectors.toList());	
	}
}
