package org.fairfax.fire.apparatusservice.mapper;

import org.fairfax.fire.apparatusservice.entity.ApparatusEntity;
import org.fairfax.fire.models.Apparatus;

public class ApparatusMapper {

	public static Apparatus mapEntityToModel(ApparatusEntity entity) {
		return Apparatus.builder()
				.apparatusId(entity.getApparatusId())
				.apparatusName(entity.getApparatusName())
				.apparatusTypeName(entity.getApparatusType().getApparatusTypeName())
				.apparatusTypeCategory(entity.getApparatusType().getApparatusTypeCategory())
				.build();
	}
}
