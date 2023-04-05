package org.fairfax.fire.facilityservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class StationNotFoundException extends RuntimeException {
	
	public StationNotFoundException(String message) {
		super(message);
	}
}
