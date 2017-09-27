package com.ltd.premiumGenerator;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ltd.premiumGenerator.model.User;
import com.ltd.premiumGenerator.service.PremiumGeneratorService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PremiumGeneratorApplicationTests {

	@Autowired
	private PremiumGeneratorService service;
	
	@Test
	public void testDefaultMaleUser() {
		User user = new User("Norman Gates","Male",18);
		double result = service.getPremium(user);
		Assert.assertEquals(5100, result,0);
	}
	@Test
	public void testDefaultFemaleUser() {
		User user = new User("Norma Gates","Female",18);
		double result = service.getPremium(user);
		Assert.assertEquals(5000, result,0);
	}
	
	@Test
	public void testUser() {
		User user = new User("Norman Gates","Male",34);
		user.setCurrentHealth(Arrays.asList(new String[] {"Overweight"}));
		user.setHabits(Arrays.asList(new String[] {"Alcohol", "Daily Exercise"}));
		double result = service.getPremium(user);
		Assert.assertEquals(5666.1, result,0);
	}
}
