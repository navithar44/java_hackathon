package basics;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//uisng scanner class print values
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer no: ");
		int num1=sc.nextInt();
		
		System.out.println("enter the float no: ");
		float f1=sc.nextFloat();
		
		System.out.println("enter the double no: ");
		double d1=sc.nextDouble();
		
		System.out.println("enter the bool value: ");
		boolean b1=sc.nextBoolean();
		System.out.println("integer value is:"+num1);
		System.out.println("float value is:"+f1);
		System.out.println("double value is:"+d1);
		System.out.println("bool value:"+b1);
		
		
		//print sum & average of nos.
		double add=num1+f1+d1;
		System.out.println("Adding int,float & double values:" +add);
		
		System.out.println("enter number 1: ");
		int x=sc.nextInt();
		System.out.println("enter number 2: ");
		int y=sc.nextInt();
		System.out.println("enter number 3: ");
		int z=sc.nextInt();
		int sum=x+y+z;
		System.out.println("Sum of three numbers:"+ sum);
		int average=(x+y+z)/2;
		System.out.println("Avearge of three numbers:"+ average);
		
	}

}
