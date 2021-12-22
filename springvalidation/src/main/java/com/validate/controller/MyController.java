package com.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validate.entities.loginData;

@Controller
public class MyController {

	
	@GetMapping("/form")
	public String openForm(Model model) {
		
		System.out.println("opening form");
		model.addAttribute("loginData", new loginData());
		
		return "form";
		
	}
	
	//handler for processing form
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") loginData loginData, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "form";
		}
		
		System.out.println(loginData);
		
		//data process
		
		return "success";
	}
}
