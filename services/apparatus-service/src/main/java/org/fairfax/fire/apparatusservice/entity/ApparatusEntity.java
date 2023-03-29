package org.fairfax.fire.apparatusservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "apparatus")
public class ApparatusEntity {

	@Id
	@Column
	private String apparatusId;
	
	@Column
	private String apparatusName;
	
	@Column
	private String assignedLocation;

	@ManyToOne
	@JoinColumn(name = "apparatus_type_id")
	private ApparatusType apparatusType;
}
