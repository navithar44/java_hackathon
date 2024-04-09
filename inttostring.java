package javahackathon;
import java.util.Scanner;

public class inttostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to convert int to string
		 Scanner sc=new Scanner(System.in); 
         System.out.println("enter the number");  
       
         int input=sc.nextInt();
        // System.out.println("adding integer no:"+(input+1));
		  String str = Integer.toString(input);
		  System.out.println("converted string value is:"+str);
		  System.out.println("concatinating string to int value"+ str+1);
		  System.out.println(str.charAt(2));
        


	}

}
