package javahackathon;
import java.util.Scanner;
public class countintupplower {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to find total number of integers, uppercase and lowercase character in the given string
		 Scanner sc=new Scanner(System.in); 
         System.out.println("enter the string");  
         String strNum=sc.nextLine();
         char[] chararray=strNum.toCharArray();
         int upper=0, lower=0, numbers=0;
         for(char c:chararray)
         {
        	 if(Character.isUpperCase(c)) {
        		 upper++;
        	 }
        	 else if(Character.isLowerCase(c)) {
        		 lower++;
        		 
        	 }
        	 else if(Character.isDigit(c)) {
        		 numbers++;
        		 
        	 }
        	 else {
        		 System.out.println(" ");
        	 }
        	 }
         System.out.println("Upper char count" + upper);
         System.out.println("lower char count" + lower);
         System.out.println("numbers count" + numbers);
         }
        }
