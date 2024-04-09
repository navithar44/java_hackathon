package javahackathon;
import java.util.Scanner;
public class selectionsort {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to perform ascending order Selection  sort
		 Scanner sc=new Scanner(System.in);
	        int n,i;   //Array Size Declaration
	        System.out.println("Enter the size of the array :");
	        n=sc.nextInt(); 
	        int []arr=new int[n]; 
	        System.out.println("Enter the elements to be sorted from the array :");
	        for(i=0;i<n;i++)  
	        	arr[i]=sc.nextInt();
	    	//System.out.println("elements to be sorted from the array :"+arr[i]+ " ");
	        
	        for( i=0;i<arr.length-1;i++) {
	        	int min_index=i;
	        	for(int j=i+1;j<arr.length;j++)
	        	{
	        		if(arr[min_index]>arr[j])
	        			min_index=j;
	        		}
	        	int temp=arr[min_index];
	        	arr[min_index]=arr[i];
	        	arr[i]=temp;
	        		
	        }
	        System.out.println();
	        for(i=0;i<arr.length;i++)
	        	System.out.println("Sorted elements of array: "+arr[i]+ " ");
	        	
	           }

}
