package com.example.demo.controller;

import com.example.demo.config.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class PropertiesController {

    @Autowired
    ServerProperties properties;

    @RequestMapping(method = RequestMethod.GET)
    public ServerProperties getServereProperties() {
        return properties;
    }
}
