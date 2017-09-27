package com.ltd.premiumGenerator.model;

import java.util.List;

public class User {

	public User(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public User()
	{
		
	}
	
	private int id;
	
	private String name;
	
	private String gender;
	
	private int age;
	
	private List<String> currentHealth;
	
	private List<String> habits;
	
	private int premium;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(List<String> currentHealth) {
		this.currentHealth = currentHealth;
	}
	public List<String> getHabits() {
		return habits;
	}
	public void setHabits(List<String> habits) {
		this.habits = habits;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}

}
