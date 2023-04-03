package org.fairfax.fire.facilityservice.dao;

import org.fairfax.fire.facilityservice.entity.StationEntity;
import org.springframework.data.repository.CrudRepository;

public interface StationDao extends CrudRepository<StationEntity, String>  {

}
