package basics;

public class avgarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,40,50};
		int x=0;
		for(int i=0;i<arr.length-1;i++)
		{ 
				x=arr[i]+x;
				
		}
		x = x / arr.length;
		System.out.println("average of the array is:" +x);
}}
