package entity;

import exception.AdoptionException;

public class Pet {
	String name;
	int age;
	String breed;

	public Pet(String string, int i, String string2, String string3) {

	}

	public Pet(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAgeWithValidation(int age) throws IllegalArgumentException {
		if (age <= 0) {
			throw new IllegalArgumentException("Invalid age. Age must be a positive integer.");
		}
		this.age = age;
	}

	public void adopt() throws AdoptionException {
		if (name == null || breed == null) {
			throw new AdoptionException("Cannot adopt pet with missing information.");
		}
		// Process adoption logic here
		System.out.println("Pet " + name + " adopted successfully!");
	}

	@Override
	public String toString() {
		return "Name :" + name + "age = " + age + "and Breed is " + breed;

	}

}