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
public class Address {
	private String addressId;
	private String address;
	private String city;
	private String state;
	private String zipCode;
}
