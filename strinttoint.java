package javahackathon;
import java.util.Scanner;
public class strinttoint {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //WJP to convert string to int
		 Scanner sc=new Scanner(System.in); 
         System.out.println("enter the string"); 
         int input=sc.nextInt();
         int number=Integer.valueOf(input);
		 
		  System.out.println("Integer value is :"+number);
		  System.out.println("Adding two integer values :"+ (number+1));
        
	}

}
