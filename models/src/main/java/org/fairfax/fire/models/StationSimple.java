package org.fairfax.fire.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StationSimple {
	private String stationNumber;
	private String stationName;
	private String battalionNumber;
	private Double latitude;
	private Double longitude;
}
