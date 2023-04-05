package org.fairfax.fire.facilityservice.controller;

import java.util.List;

import org.fairfax.fire.facilityservice.exception.StationNotFoundException;
import org.fairfax.fire.facilityservice.service.FacilityService;
import org.fairfax.fire.models.Station;
import org.fairfax.fire.models.StationSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("facility")
public class FacilityController {

	@Autowired
	private FacilityService facilityService;
	
	@GetMapping("/station/all")
	public List<StationSimple> getStations() {
		return facilityService.getAllStations();
	}
	
	@GetMapping("/station/find/{stationNumber}")
	public Object getStation(@PathVariable String stationNumber) {
		Station station = facilityService.getStation(stationNumber);
		if (station == null) {
			throw new StationNotFoundException("stationNumber:" + stationNumber);
		}
		return station;		
	}
}
