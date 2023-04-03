package org.fairfax.fire.facilityservice.mapper;

import org.fairfax.fire.facilityservice.entity.StationEntity;
import org.fairfax.fire.models.StationSimple;

public class StationMapper {

	public static StationSimple mapEntityToModel(StationEntity entity) {
		return StationSimple.builder()
				.stationNumber(entity.getStationNumber())
				.stationName(entity.getStationName())
				.battalionNumber(entity.getBattalionNumber())
				.latitude(entity.getLatitude())
				.longitude(entity.getLongitude())
				.build();
	}
}
