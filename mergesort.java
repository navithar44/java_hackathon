package javahackathon;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
	public static void merge(int a[],int beg, int mid, int end)
	{
		int i, j,k;
		int n1=mid-beg+1;
		int n2=end-mid;
		//temp arrays
		int leftarray[]=new int[n1];
		int rightarray[]=new int[n2];
		for(i=0;i<n1;i++)
		{
			leftarray[i]=a[beg+i];
		}
		for(j=0;j<n2;j++)
		{
			rightarray[j]=a[mid+1+j];
		}
		i=0;
		j=0;
		k=beg;
		while(i<n1 && j<n2)
		{
			if(leftarray[i]<=rightarray[j])
			{
				a[k]=leftarray[i];
				i++;
			}
			else
			{
				a[k]=leftarray[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=rightarray[j];
			j++;
			k++;
		}
	}
public static void mergesort(int a[], int beg, int end)
{
	if(beg <end)
	{
		int mid=(beg+end)/2;
		mergesort(a,beg,mid);
		mergesort(a,mid+1,end);
		merge(a,beg,mid,end);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the arrray size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array value: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before sorting: "+Arrays.toString(a));
		mergesort(a,0,size-1);
		System.out.println("After sorting:" +Arrays.toString(a));
		
		System.out.println("");
		}

}

