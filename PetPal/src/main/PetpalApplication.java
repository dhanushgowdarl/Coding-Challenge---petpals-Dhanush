package main;

import dao.IAdoptable;
import entity.AdoptionEvent;
import entity.Donation;
import entity.Pet;
import exception.PetShelter;

public class PetpalApplication {

	public static void main(String[] args) {
		Pet dog = new Dog("Buddy", 3, "Golden Retriever", "Golden");
		Pet cat = new Cat("Whiskers", 2, "Siamese", "White");

		PetShelter shelter = new PetShelter();
		shelter.addPet(dog);
		shelter.addPet(cat);

		shelter.listAvailablePets();

		Donation cashDonation = new CashDonation("John Doe", 100.0, "2023-01-01");
		Donation itemDonation = new ItemDonation("Jane Doe", 50.0, "Toys");

		cashDonation.recordDonation();
		itemDonation.recordDonation();

		AdoptionEvent adoptionEvent = new AdoptionEvent();

		adoptionEvent.registerParticipant((IAdoptable) shelter);
		adoptionEvent.registerParticipant((IAdoptable) dog);

		adoptionEvent.hostEvent();

		PetShelter shelter = new PetShelter();

		shelter.readPetsFromFile("pets.txt");
	}
}
