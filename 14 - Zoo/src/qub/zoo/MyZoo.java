package qub.zoo;

import animals.wild.*;
import animals.domestic.*;

public class MyZoo {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Shark shark = new Shark();
		
		dog.setBreed("German Shepard");
		shark.setSharkFamily("Great White");
		
		System.out.println(dog.getBreed());
	}

}
