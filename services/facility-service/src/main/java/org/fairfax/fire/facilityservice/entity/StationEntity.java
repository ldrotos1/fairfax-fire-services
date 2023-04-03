package org.fairfax.fire.facilityservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "station")
public class StationEntity {

	@Id
	@Column
	private String stationNumber;
	
	@Column
	private String stationName;
	
	@Column
	private String battalionNumber;
	
	@Column
	private String divisionNumber;
	
	@Column
	private Boolean isBattalionHq;
	
	@Column
	private Boolean isDivsionHq;
	
	@Column
	private Boolean isVolunteer;
	
	@Column
	private Double latitude;
   	
	@Column
	private Double longitude;
}
