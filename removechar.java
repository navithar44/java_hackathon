package javahackathon;

import java.util.Scanner;

public class removechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a method that will remove given character from the String?
		 
	                  Scanner sc=new Scanner(System.in); 
	                  System.out.println("enter the string");  
	                  String input=sc.nextLine();
	                  System.out.println("enter the character to remove:");
	                  char remove=sc.next().charAt(0);
	                  String result=removechar(input,remove);
	                  System.out.println("Result after removing character: "+result);
	                  sc.close();
	               }  
	               public static String removechar(String input, char remove) {  
	                  return input.replace(String.valueOf(remove),"");  
	               }  
	    }  