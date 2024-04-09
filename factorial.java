package javahackathon;

public class factorial {
	
	static int factorial(int n)
	{
		if(n==0)
			
			return 1;
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4;
factorial(3);
System.out.println("factorial of "+num + " is : "+factorial(4));
	}

}
