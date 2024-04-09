package javahackathon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniquewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Given a string print the unique words of the string.
		//Scanner sc=new Scanner(System.in);
		 Scanner scanner = new Scanner(System.in);
	        Set<String> uniqueWords = new HashSet<>();
	        
	        System.out.println("Enter the string:");
	        String input = scanner.nextLine().trim();
	        
	        // Split the input string by whitespace
	        String[] words = input.split("\\s+");
	        
	        
	        // Add each word to the uniqueWords set
	        for (String word : words) {
	            uniqueWords.add(word);
	        }
	        
	        System.out.println("Unique words:");
	        for (String word : uniqueWords) {
	            System.out.println(word);
	        }
	        
	        scanner.close();
	}

}
