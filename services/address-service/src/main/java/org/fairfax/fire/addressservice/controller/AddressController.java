package org.fairfax.fire.addressservice.controller;

import org.fairfax.fire.addressservice.service.AddressService;
import org.fairfax.fire.addressservice.exception.AddressNotFoundException;
import org.fairfax.fire.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/find/{addressId}")
	public Address getAddress(@PathVariable String addressId) {
		Address address = addressService.getAddress(addressId);
		if (address == null) {
			throw new AddressNotFoundException("addressId:" + addressId);
		}
		return address;
	}
}
