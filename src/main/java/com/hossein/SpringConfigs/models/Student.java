package com.hossein.SpringConfigs.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private Integer age;
	private String name;
	@Autowired
	@Qualifier("country2")
	private Country country;

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return this.getName() + " " + "Is " + this.getAge()
		+ " Years Old And Lives In " + this.getCountry().getName() + " With "
		+ this.getCountry().getPopulation()	+ " People";
	}
	
	
	
}
