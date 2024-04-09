package basics;

import java.util.Scanner;

public class sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To print sum & Average of nos.
         int sum;
         int avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		int num1=sc.nextInt();
		System.out.println("Enter no2:");
		int num2=sc.nextInt();
		System.out.println("Enter no3:");
		int num3=sc.nextInt();
		System.out.println("sum of the three numbers:" +(sum=(num1+num2+num3)));
		System.out.println("Average of three numbers:" +(avg=(num1+num2+num3)/2));
		
		
		
	}

}
