package com.bharath.patterns.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(ModelMap modelMap) {
		modelMap.addAttribute("msg","Patrick");
		return "helloMvc";
	}

}
