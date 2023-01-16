package com.tracking.services;

import com.tracking.models.IssLocator;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {
    public IssLocator getLocation(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", IssLocator.class);
    }
}
