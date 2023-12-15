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
}
