package basics;

import java.util.Scanner;

public class persondetail {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //accept Name, Age, Gender and Address (single line) of a person from the user and print them in separate lines 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name, age, and address separated by commas:");
	        String input = scanner.nextLine();
           // Splitting the input string by commas
	        String[] parts = input.split(",");

	        // Extracting name, age, and address
	        String name = parts[0].trim();
	        int age = Integer.parseInt(parts[1].trim());
	        String address = parts[2].trim();

	        // Printing out the information
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
            scanner.close();
		
	}

}
