package main;

import java.util.Scanner;

import dao.IAdoptable;
import entity.AdoptionEvent;
import entity.Cats;
import entity.Dogs;
import entity.Donation;
import entity.Pet;
import exception.PetShelter;

public class PetpalApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PetShelter petShelter = new PetShelter(); // Initialize your PetShelter object

		int choice;
		do {
			System.out.println("=== PetPals Menu ===");
			System.out.println("1. Display Pet Listings");
			System.out.println("2. Record Cash Donation");
			System.out.println("3. Manage Adoption Events");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				displayPetListings();
				break;
			case 2:
				recordCashDonation();
				break;
			case 3:
				recordItemDonation();
				break;
			case 0:
				System.out.println("Exiting PetPals. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 0);

		scanner.close();
	}

	private static void displayPetListings() {
		System.out.println("Total Pets");
	}

	private static void recordCashDonation() {
		System.out.println("Total Donation");
	}

	private static void recordItemDonation() {
		       System.out.println("Total Items");
	}    
}
