package com.tracking.controller;

import com.tracking.models.IssLocator;
import com.tracking.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class IssController {
    @Autowired
    LocationService service;
    @GetMapping("/iss")
    public IssLocator getIssLocation(){
        return service.getLocation();
    }
    /**
     * LeafLet.js
     * Spring boot
     */
}
