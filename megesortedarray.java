package javahackathon;

public class megesortedarray {
	public static void merge(int[] Array1,int m, int[] Array2,int n) {
		int p2=n-1,i=m+n-1;
		while(p2>=0)
		Array1[i--]=Array2[p2--];
		
		}
	       public static void main(String[] args) {
		// TODO Auto-generated method stub
		// given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order. 
		{
			int Array1[]= {1,2,3,4,5,0,0,0};
	    int Array2[] = {6,7,8};
	    int m=5;
	    int n=3;
	    merge(Array1,m,Array2,n);
	    for (int i=0;i<m+n;i++) {
	    System.out.print((Array1[i]+" "));
	    }
		}
	    }}
