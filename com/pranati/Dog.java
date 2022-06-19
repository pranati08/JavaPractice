package com.pranati;

public class Dog extends Mammal {


	private String color;
	private String name;
	
	//constructor 
	public Dog(String color, String name) {
		this.color = color;
		this.name = name;
	}

	
	public void move() {
		System.out.println("The Dog runs.");
		
	}

	
	public void makeNoise() {
		System.out.println("Bow Bow");
		
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	
	public String getName() {
		return this.name;
	}


}
