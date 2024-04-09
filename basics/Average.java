package basics;
import java.util.*;

public class Average {
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Average av=new Average();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first no:");
    int a=sc.nextInt();
    System.out.println("enter the second no:");
    int b=sc.nextInt();
    System.out.println("enter the third no:");
    int c=sc.nextInt();
    int sum=a+b+c;
    int z= ((a+b+c)/3);
	System.out.println("Average of the nos: "+z);
    System.out.println("Sum of the given numbers is:" +sum);
    
	}

}
