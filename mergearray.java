/*WJP to merge two sorted array.(Do not use third array)		
array1[10] = 1,2,4,6,9,10		
array2[4] =  3, 5,7,8		
After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10*/
package javahackathon;
public class mergearray {
	
		public static void main(String[] args)
		{int Array1[]= {1,2,4,6,9,10,0,0,0,0};
	    int Array2[] = {3,5,7,8};
	    int m=6;
	    int n=4;
	    merge(Array1,m,Array2,n);
	    for (int i=0;i<m+n;i++) {
	    System.out.print((Array1[i]+" "));
	    }
		}
	    public static void merge(int[] Array1,int m, int[] Array2,int n) {
		int p1=m-1,p2=n-1,i=m+n-1;
		while(p2>=0) {
			if(p1>=0 && Array1[p1]>Array2[p2]) {
				Array1[i--]=Array1[p1--];
			}
			else {
				Array1[i--]=Array2[p2--];
			}
		}
	       }}
