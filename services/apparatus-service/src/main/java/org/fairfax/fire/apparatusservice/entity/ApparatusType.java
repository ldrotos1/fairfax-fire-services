package org.fairfax.fire.apparatusservice.entity;

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
@Entity(name = "apparatus_type")
public class ApparatusType {

	@Id
	@Column
	private String apparatusTypeId;
	
	@Column
	private String apparatusTypeName;
	
	@Column
	private String apparatusTypeCategory;
}
