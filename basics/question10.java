package basics;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//find 1st,2nd,3rd biggest nos
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int num1=sc.nextInt();
		System.out.println("enter the no: ");
		int num2=sc.nextInt();
		System.out.println("enter the no: ");
		int num3=sc.nextInt();
		if((num1>num2)&&(num1>num3))
		{
			System.out.println(num1);
			if(num2>num3)
			{
				System.out.println(num2); 
				System.out.println(num3);
			}
			if(num3>num2)
			{
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println(num2);
			if(num1>num3)
			{
				System.out.println(num1);
				System.out.println(num3);
			}
			if(num3>num1)
			{
				System.out.println(num3);
				System.out.println(num1);
			}
		}	
		else if((num3>num1)&&(num3>num2)) 
		{
			System.out.println(num3);
			if(num1>num2)
			{
				System.out.println(num1);
				System.out.println(num2);
			}
			if(num2>num1)
			{
				System.out.println(num2);
				System.out.println(num1);
			}
		}
		else
			System.out.println("hello");
	}

}
