package javahackathon;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program for binary search.
		int a[]= {3,4,5,6,7};

		boolean b=false;
		int key=8;
		int lower_value=0;
		int higher_value=a.length-1;
		while(lower_value<=higher_value)
		{
			int medium=(lower_value+higher_value)/2;
			if(a[medium]==key)
			{
				System.out.println("Number found..");
				b=true;
				break;
			}
			if(a[medium]<key)
					{
				lower_value=medium+1;
					}
			if(a[medium]>key)
			{
				higher_value=medium-1;
			}
		}
		if(b==false)
			System.out.println("number not found");
	}

}
