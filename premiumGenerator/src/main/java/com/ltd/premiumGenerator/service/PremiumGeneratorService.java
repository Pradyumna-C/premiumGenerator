package com.ltd.premiumGenerator.service;

import org.springframework.stereotype.Service;

import com.ltd.premiumGenerator.model.User;

@Service
public class PremiumGeneratorService {

	private double premium;
	
	public double getPremium(User user) {
	generatePremiumWithAgeAndGender(user);
	generatePremiumWithCurrentHealth(user);
	generatePremiumWithHabits(user);
		return premium;
	}

	private void generatePremiumWithAgeAndGender(User user) {
		premium = 5000;
		if(user.getAge()<=18){
			premium = 5000;
		} else if (user.getAge()> 18 && user.getAge()<=40){
			premium += premium*0.1;
		} else{
			premium += premium*0.2;
		}
		if(null != user.getGender() && user.getGender().equalsIgnoreCase("male")){
			premium += premium * 0.02;
		}
	}
	
	private void generatePremiumWithCurrentHealth(User user) {
		if(null != user.getCurrentHealth() && !user.getCurrentHealth().isEmpty())
		premium += premium*user.getCurrentHealth().size()*0.01;
	}	
	
	private void generatePremiumWithHabits(User user) {
		if(null != user.getHabits() && !user.getHabits().isEmpty()) {
		int value = 0;
		if(user.getHabits().contains("Smoking")){
			value += 3;
		} 
		if (user.getHabits().contains("Alcohol")){
			value += 3;
		}
		if (user.getHabits().contains("Drugs")){
			value += 3;
		}
		if (user.getHabits().contains("Daily Exercise")){
			value -= 3;
		}
		premium += premium*value*0.01;
		}
	}		
}
	
