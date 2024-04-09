package javahackathon;
import java.util.Scanner;
public class stringintbool {
	public static boolean checkIntegerValue(String str)
	{
		boolean isInteger=false;
		try
		{int i=Integer.parseInt(str);
			isInteger=true;
		}
		catch(Exception e)
		{
			System.out.println("exception found");
		}
		return isInteger;
	}

	public static boolean checkBooleanValue(String str)
	{
		boolean isBoolean=false;
		if("true".equals(str) || "false".equals(str)) {
			isBoolean=true;
		}
	return isBoolean;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
        System.out.println("enter the input value:");  
      String str=sc.nextLine();
if(checkIntegerValue(str)) {
	 System.out.println("it is integer:" +str);
 }
 else if(checkBooleanValue(str)) {
	 System.out.println("it is Boolean:" +str);
 }
 else {
	 System.out.println("it is String:" +str); 
 }

	}

}
