package javahackathon;
public class Q32mergeaandb {
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
	       }
		public static void main(String[] args) {
		
		int Array1[]= {1,2,3,0,0};
	    int Array2[] = {4,5};
	    int m=3;
	    int n=2;
	    merge(Array1,m,Array2,n);
	    for (int i=0;i<m+n;i++) {
	    System.out.print((Array1[i]+" "));
	    }
		}
	    
	}


