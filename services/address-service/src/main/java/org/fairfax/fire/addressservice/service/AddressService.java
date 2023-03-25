package org.fairfax.fire.addressservice.service;

import org.fairfax.fire.addressservice.dao.AddressDao;
import org.fairfax.fire.addressservice.entity.AddressEntity;
import org.fairfax.fire.addressservice.mapper.AddressMapper;
import org.fairfax.fire.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AddressService {
	
	@Autowired
	private AddressDao addressDao;
	
	public Address getAddress(String addressId) {
		Optional<AddressEntity> result = addressDao.findById(addressId);
		if (result.isPresent()) {
			return AddressMapper.mapEntityToModel(result.get());
		}
		return null;
	}
}
