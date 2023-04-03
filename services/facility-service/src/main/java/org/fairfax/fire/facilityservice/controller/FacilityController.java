package org.fairfax.fire.facilityservice.controller;

import java.util.List;

import org.fairfax.fire.facilityservice.service.FacilityService;
import org.fairfax.fire.models.StationSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("facility")
public class FacilityController {

	@Autowired
	private FacilityService facilityService;
	
	@GetMapping("/station/all")
	private List<StationSimple> getStations() {
		return facilityService.getAllStations();
	}
}
