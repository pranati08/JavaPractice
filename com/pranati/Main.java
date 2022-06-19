package com.pranati;

public class Main {

	public static void main(String args[]) {
		Mammal myDog= new Dog("Black", "Miko");	
		Mammal myCat = new Cat();
		Mammal myCow = new Cow();
		
		Mammal animals[] = new Mammal[3];
		animals[0] = myDog;
		animals[1] = myCat;
		animals[2] = myCow;
		
		makeNoiceAllAnimals(animals);
		makeAllAnimalsMove(animals);
		checkAllAnimalsHasFur(animals);
	}
	
	public static void makeNoiceAllAnimals(Animal[] animals) {
		for (Animal animal : animals) {
			animal.makeNoise();
		}
	}
	
	public static void makeAllAnimalsMove(Animal[] animals) {
		for (Animal animal : animals) {
			animal.move();
		}
	}
	
	public static void checkAllAnimalsHasFur(Mammal[] animals) {
		for (Mammal animal : animals) {
			animal.hasFur();
		}
	}
}
