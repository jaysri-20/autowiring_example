package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Component
public class Controller_layer {
String msg;
public String getMessage() {
	
	return "hello";
}
}
