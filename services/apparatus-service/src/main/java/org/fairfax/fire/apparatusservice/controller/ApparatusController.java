package org.fairfax.fire.apparatusservice.controller;

import java.util.List;

import org.fairfax.fire.apparatusservice.service.ApparatusService;
import org.fairfax.fire.models.Apparatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apparatus")
public class ApparatusController {

	@Autowired
	private ApparatusService apparatusService;
	
	@GetMapping("/find-by/{facilityNumber}")
	public List<Apparatus> getApparatus(@PathVariable String facilityNumber) {
		return apparatusService.getApparatusAssignedToFacility(facilityNumber);
	}
}
