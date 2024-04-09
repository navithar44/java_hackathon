package javahackathon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class printduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
		 Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt(); 
        int arr[]=new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)    
        {
            arr[i]=sc.nextInt();
             }
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        for (int num : arr) {
            if (!uniqueValues.add(num)) { // If num already exists in uniqueValues, it's a duplicate
                duplicateValues.add(num);
            }
        }

        // Remove duplicate values from uniqueValues
        uniqueValues.removeAll(duplicateValues);

        System.out.println("Unique values in the array: " + uniqueValues);
        System.out.println("Duplicate values in the array: " + duplicateValues);
    }
	}


