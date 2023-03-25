package org.fairfax.fire.addressservice.entity;

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
@Entity(name = "addresses")
public class AddressEntity {
	
	@Id
	private String addressId;
	private String address;
	private String city;
	private String state;
	private String zipCode;
}
