package org.fairfax.fire.facilityservice.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.fairfax.fire.facilityservice.dao.StationDao;
import org.fairfax.fire.facilityservice.entity.StationEntity;
import org.fairfax.fire.models.Station;
import org.fairfax.fire.models.StationSimple;
import org.fairfax.fire.facilityservice.mapper.StationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilityService {

	@Autowired
	private StationDao stationDao;
	
	public List<StationSimple> getAllStations() {
		List<StationSimple> stations = new ArrayList<StationSimple>();
		stationDao.findAll().iterator().forEachRemaining(s -> {
			stations.add(StationMapper.mapStationSimpleEntityToModel(s));
		});
		return stations;
	}
	
	public Station getStation(String stationNumber) {
		Optional<StationEntity> result = stationDao.findById(stationNumber);
		if (result.isPresent()) {
			return StationMapper.mapStationEntityToModel(result.get());
		}
		return null;	
	}
}
