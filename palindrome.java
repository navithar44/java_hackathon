package javahackathon;

import java.util.Scanner;

public class palindrome {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
      
        for (int i = 0; i < n; i++) {
        	
            if (isPalindrome(arr[i])) {
                System.out.println("Given "+ arr[i]+" is Palindrome no ");
            }
        }
        scanner.close();
    }
        // Method to check if a number is a palindrome
        public static boolean isPalindrome(int arr) {
            int reversedNum = 0;
            int originalNum = arr;
          
            while (arr != 0) {
                int digit = arr % 10;
                reversedNum = reversedNum * 10 + digit;
                arr /= 10;
            }
            return originalNum == reversedNum;
        

    }
    
   
}

	


