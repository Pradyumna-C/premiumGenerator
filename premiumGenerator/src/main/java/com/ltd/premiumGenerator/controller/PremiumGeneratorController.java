package com.ltd.premiumGenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ltd.premiumGenerator.model.User;
import com.ltd.premiumGenerator.service.PremiumGeneratorService;

@RestController
public class PremiumGeneratorController {

	@Autowired
	private PremiumGeneratorService premiumGeneratorService;
	
	@RequestMapping(method=RequestMethod.POST,value="/premiumGenerator")
	public double getPremium(@RequestBody User user){
		return premiumGeneratorService.getPremium(user);
	}
}
