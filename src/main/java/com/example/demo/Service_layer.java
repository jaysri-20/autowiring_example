package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Service_layer {
@Autowired
	public Model_layer m;
public Service_layer() {
        // Avoid using m here because it's not injected yet
    }

    @PostConstruct
    public void init() {
        System.out.println(m.getMsg());  // Safe to use m here as it’s now injected
    }

}
