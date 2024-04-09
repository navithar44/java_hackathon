package basics;
import java.util.*;

public class question12 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        //to print revised salary for an employee
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the experience: ");
		int exp=sc.nextInt();
		
		int osal=2000;
		int rsal=0;
		if(exp>=3 && exp<=5)
		{
			 rsal=(int)(osal*1.1);
			 System.out.println("\t rsal: "+rsal+"\n\t exp-years: "+exp);//2200
		}
		else if(exp>=6 && exp<=9)
		{
			  rsal=(int)(osal*1.15);
			  System.out.println(rsal);//2300
		}
		else if(exp>=10 && exp<=20)
		{
			 rsal=(int)(osal*1.2);
			 System.out.println(rsal);//2400
		}
		else 
		{
			rsal=(int)(osal*1.25+1000);
			System.out.println(rsal);//3500
		
		}
	}
	
}



