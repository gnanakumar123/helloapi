package com.example.helloapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

	@RequestMapping("/helloapi")
	public String hello() {
		return "This is a hello api";
	}

	@GetMapping(path = "/getHello")
	public String getMessage() {

		return "This is a successful response";
	}

}
