package org.fairfax.fire.addressservice.mapper;

import org.fairfax.fire.addressservice.entity.AddressEntity;
import org.fairfax.fire.models.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

	public static Address mapEntityToModel(AddressEntity address) {
		return Address.builder()
				.addressId(address.getAddressId())
				.address(address.getAddress())
				.city(address.getCity())
				.state(address.getState())
				.zipCode(address.getZipCode())
				.build();
	}
}
