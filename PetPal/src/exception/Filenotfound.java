package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filenotfound {
	public void readPetsFromFile(String filename) {
		File file = new File(filename);

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				// Process each line of the file as needed
				System.out.println("Read from file: " + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
		} catch (Exception e) {
			System.out.println("Error reading data from file: " + e.getMessage());
		}
	}

}
