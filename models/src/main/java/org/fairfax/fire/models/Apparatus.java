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
public class Apparatus {
	private String apparatusId;
	private String apparatusName;
	private String apparatusTypeName;
	private String apparatusTypeCategory;
}
