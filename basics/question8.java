package basics;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	 //print 5 nos in a row
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=5;j++)
		{
			System.out.print(i);
		}System.out.println();
	}
	System.out.println();
	
	//print nos in decreasing order
	
	for (int i=5; i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println();

	}
	
	
	//print * in diamond shape
	
	for (int i=1;i<=5;i++)
	{
		for(int k=i;k<=4;k++)
		System.out.print(" ");
		for(int j=1;j<=i; j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	for (int i=4;i>0;i--)
	{
		for(int l=5-i;l>0;l--)
			System.out.print(" ");
		for(int j=1;j<=i; j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}

	
	}
	

}
