package javahackathon;
import java.util.Scanner;
public class Q1Booleanvariable {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a,b,c;
		boolean result;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the first boolean value: ");
		a=sc.nextBoolean();
		System.out.print("enter the second boolean value: ");
		b=sc.nextBoolean();
		System.out.print("enter the third boolean value: ");
		c=sc.nextBoolean();
		if(a) {
			result =b|| c;
			
		}
		else {
			result=b&& c;
		}
		if(result) {
			System.out.println("Two boolean variables are true:");
			}
		else {
			System.out.println("Two boolean variables are not true:");
			
		}
		sc.close();
		}

	}


