package exception;

import java.util.List;

import entity.Pet;

class PetShelter {

	private List<Pet> availablePets;

	public void addPetWithValidation(Pet pet) {
		try {
			pet.setAgeWithValidation(pet.getAge());
			availablePets.add(pet);
			System.out.println("Pet added successfully!");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void listAvailablePets() {
		System.out.println("Available Pets:");
		for (Pet pet : availablePets) {
			try {
				System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Breed: " + pet.getBreed());
			} catch (NullPointerException e) {
				System.out.println("Error: Information missing for a pet.");
			}
		}
	}
}
