package basics;

import java.util.Arrays;

public class sortarray {
public static void main(String[] args) 
	{ 
	//Sort the array in descending order
		int [] arr = new int[]{5,22,54,88,11};    
	    int temp = 0;    
    //Displaying elements of the original array    
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " ");    
	        }    
            for (int i = 0; i < arr.length; i++) 
	        {    
	            for (int j = i+1; j < arr.length; j++) 
	            {     
	               if((arr[i]) + 1 < (arr[j]) + 1)
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
             System.out.println();    
      //Displaying elements of array after sorting    
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " "); 
	           }
	       System.out.println();
		//sorting string array in order
	        String[] myArray = {"Java", "HBase", "python","SQL", "Hadoop", "AWS"};
	        int size = myArray.length;
	        //String count;

	        for(int i = 0; i<size-1; i++)
	        {
	           for (int j = i+1; j<myArray.length; j++) 
	           {
	              if(myArray[i].compareTo(myArray[j])>0) 
	              {
	                 String cnt = myArray[i];
	                 myArray[i] = myArray[j];
	                 myArray[j] = cnt;
	              }
	           }
	        }
	        for (int i=0;i<myArray.length;i++)
	        {
	        System.out.print(myArray[i] + " ");
	        }
	        
	     }
	  }