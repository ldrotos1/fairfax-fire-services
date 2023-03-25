package org.fairfax.fire.addressservice.dao;

import org.fairfax.fire.addressservice.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends CrudRepository<AddressEntity, String> {

}
