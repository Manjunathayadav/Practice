package com.vmtech.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@Value("${custom.prop}")
	private String var;
	
	@GetMapping("/get")
	public String helloWorld(Model model) {
		model.addAttribute("name", "Spring boot");
		return "helloWorldDynamic";
	}
	
	@GetMapping("/get/prop")
	public String helloWorldProp(Model model) {
		model.addAttribute("name", var);
		return "helloWorldDynamic";
	}

}
