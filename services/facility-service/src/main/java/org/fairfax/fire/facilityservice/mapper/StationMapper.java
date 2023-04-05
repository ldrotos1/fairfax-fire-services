package org.fairfax.fire.facilityservice.mapper;

import org.fairfax.fire.facilityservice.entity.StationEntity;
import org.fairfax.fire.models.Station;
import org.fairfax.fire.models.StationSimple;

public class StationMapper {

	public static StationSimple mapStationSimpleEntityToModel(StationEntity entity) {
		return StationSimple.builder()
				.stationNumber(entity.getStationNumber())
				.stationName(entity.getStationName())
				.battalionNumber(entity.getBattalionNumber())
				.latitude(entity.getLatitude())
				.longitude(entity.getLongitude())
				.build();
	}
	
	public static Station mapStationEntityToModel(StationEntity entity) {
		return Station.builder()
				.stationNumber(entity.getStationNumber())
				.stationName(entity.getStationName())
				.battalionNumber(entity.getBattalionNumber())
				.divisionNumber(entity.getDivisionNumber())
				.isBattalionHq(entity.getIsBattalionHq())
				.isDivsionHq(entity.getIsDivsionHq())
				.isVolunteer(entity.getIsVolunteer())
				.latitude(entity.getLatitude())
				.longitude(entity.getLongitude())
				.build();
	}
}
