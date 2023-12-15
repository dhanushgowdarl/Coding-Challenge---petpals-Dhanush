package main;

import dao.IAdoptable;
import entity.AdoptionEvent;
import entity.Cats;
import entity.Dogs;
import entity.Donation;
import entity.Pet;
import exception.PetShelter;

public class PetpalApplication {

	public static void main(String[] args) {
		Pet dog = new Dogs();
		Pet cat = new Cats("Whiskers");

		PetShelter shelter = new PetShelter();
		shelter.addPet(dog);
		shelter.addPet(cat);

		shelter.listAvailablePets();

		Donation cashDonation = new Donation("John Doe", 100.0, "2023-01-01");
		Donation itemDonation = new Donation("Jane Doe", 50.0, "Toys");

		cashDonation.recordDonation();
		itemDonation.recordDonation();

		AdoptionEvent adoptionEvent = new AdoptionEvent();

		adoptionEvent.registerParticipant((IAdoptable) shelter);
		adoptionEvent.registerParticipant((IAdoptable) dog);

		adoptionEvent.hostEvent();

		PetShelter shelter1 = new PetShelter();

		shelter1.readPetsFromFile("pets.txt");
	}
}
