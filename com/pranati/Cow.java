package com.pranati;

public class Cow extends Mammal {

	@Override
	public void move() {
		System.out.println("Cow is moving");
	}

	@Override
	public void makeNoise() {
		System.out.println("Moo Moo");
	}

}
