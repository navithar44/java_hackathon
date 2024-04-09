package basics;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no:");
	    int num=sc.nextInt();
	    int count=0;
	    for (int x = 0; x < a.length; x++) 
	    {
            if (a[x] == num) {
                System.out.println("Value exists in array!");
                count++;
                break;
         }
         sc.close();
         
        }
	    if(count==0)
	    System.out.println("Value does not exist in the array!");
    }

		
		
		
	} 

