package org.fairfax.fire.facilityservice.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import org.fairfax.fire.models.Address;
import org.fairfax.fire.models.Apparatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import static org.springframework.http.HttpMethod.GET;

@Component
public class FacilityIntegration {

	private static final Logger LOG = LoggerFactory.getLogger(FacilityIntegration.class);
	private final RestTemplate restTemplate;    
    private final String apparatusServiceUrl = "http://localhost:8082/apparatus/find-by/";
    private final String addressServiceUrl = "http://localhost:8081/address/find/";
    
    @Autowired
    public FacilityIntegration(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public Address getFacilityAddress(String facilityId) {

        try {
            String url = addressServiceUrl + facilityId;
            Address address = restTemplate.getForObject(url, Address.class);
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
    
    public List<Apparatus> getStationApparatus(String facilityNumber) {
    	try {
            String url = apparatusServiceUrl + facilityNumber;
            List<Apparatus> apparatus = restTemplate.exchange(url, GET, null, 
            		new ParameterizedTypeReference<List<Apparatus>>() {}).getBody();
            return apparatus;   		
    	}
    	catch (HttpClientErrorException ex) {
        	if (ex.getStatusCode().isSameCodeAs(HttpStatus.NOT_FOUND)) {
        		LOG.warn("Could not find apparatus list with facility number: {}", facilityNumber);
        	} else {
                LOG.warn("Got a unexpected HTTP error: {}", ex.getStatusCode());
                LOG.warn("Error body: {}", ex.getResponseBodyAsString());
        	}
        	return null;	
    	}
    }
}
