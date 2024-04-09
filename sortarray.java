package javahackathon;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class sortarray {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array of integers, sort the integer values.
		
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt(); 
        int arr[]=new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)    
        {
            arr[i]=sc.nextInt();
             }
      
        Arrays.sort(arr);    //Sorts the Array in Ascending Order
       
        System.out.println("Sorted arr[] : " + Arrays.toString(arr)); 
       sc.close();
    }

}


