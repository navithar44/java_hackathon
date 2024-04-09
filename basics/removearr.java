package basics;

import java.util.Arrays;

public class removearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= new int[] {20,30,40,50,60,70,80};
		 int[]ar_new1 = new int[ar.length-1];

		for(int i=0;i<ar.length;i++)
			if(i<=4)
		{
				ar_new1[i]=ar[i]; 
		}
			else
				ar_new1[i-1] = ar[i];
		
		System.out.println("Array after deletion :" +Arrays.toString(ar_new1));
		System.out.println("Array before deletion :" + Arrays.toString(ar));
		
	
}

}

