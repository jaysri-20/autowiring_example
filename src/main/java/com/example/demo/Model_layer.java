package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
@Component
public class Model_layer {
	@Autowired
public Controller_layer ms;
    private String msg;

    @PostConstruct
    public void init() {
        this.msg = ms.getMessage();  
    }

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

}
