package com.nab.udemy.restwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nab.udemy.restwebservices.bean.HelloWorld;

@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//method - "Hello World"

	//@RequestMapping(method = RequestMethod.GET , path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}	
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("NICOLAS");
	}
	
	@GetMapping(path = "/hello-world-tostring")
	public String helloWorldToString() {
		return new HelloWorld("NICOLAS").toString();
	}
	
	@GetMapping(path = "/hello-world-pathvariable/{msg}")
	public String helloWorldPathVariable(@PathVariable String msg) {
		return new HelloWorld(msg).toString();
	}
	

}
