package org.fairfax.fire.facilityservice.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.fairfax.fire.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class FacilityIntegration {

	private static final Logger LOG = LoggerFactory.getLogger(FacilityIntegration.class);
	
	private final RestTemplate restTemplate;    
    
    private final String addressServiceUrl = "http://localhost:8081/address/find/";
    
    @Autowired
    public FacilityIntegration(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public Address getFacilityAddress(String facilityId) {

        try {
            String url = addressServiceUrl + facilityId;
            LOG.debug("Will call find address API on URL: {}", url);

            Address address = restTemplate.getForObject(url, Address.class);
            LOG.debug("Found a address with id: {}", address.getAddressId());

            return address;
        } 
        catch (HttpClientErrorException ex) {
        	if (ex.getStatusCode().isSameCodeAs(HttpStatus.NOT_FOUND)) {
        		LOG.warn("Could not find address with id: {}", facilityId);
        	} else {
                LOG.warn("Got a unexpected HTTP error: {}", ex.getStatusCode());
                LOG.warn("Error body: {}", ex.getResponseBodyAsString());
        	}
        	return null;
        }
    }
}
