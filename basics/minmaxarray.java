package basics;

public class minmaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {24,45,67,89,12};
		int i=a[0];
		int min=a[0]; 
		int max=0;
		for(i=0;i<a.length;i++)
		{
				if(a[i]<min)
			     {
					min=a[i];
			     }
				 else
			      max=a[i];
		}
		System.out.println("the max value from the given array:" +max);
		System.out.println("the min value from the given array:" +min);		
	
		}
	}


