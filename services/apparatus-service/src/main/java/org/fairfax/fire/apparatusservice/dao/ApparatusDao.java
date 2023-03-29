package org.fairfax.fire.apparatusservice.dao;

import java.util.List;

import org.fairfax.fire.apparatusservice.entity.ApparatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApparatusDao extends CrudRepository<ApparatusEntity, String> {

	List<ApparatusEntity> findByAssignedLocation(String locationNumber);
}
