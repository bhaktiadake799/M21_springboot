package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Component
public class hellocontroller {
	@RequestMapping("/m21")
	public String display()
	{
		return"welcome to 21 batch";
	}

}
