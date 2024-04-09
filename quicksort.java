package javahackathon;
public class quicksort {
	public static void quicksort(int[] array1,int left,int right) {
		if(left<right) {
			int pindex=partition(array1,left,right);
			quicksort(array1,left,pindex-1);
			quicksort(array1,pindex+1,right);
		}
	}
	public static int partition(int[] array1,int low, int high) {
		int pivot=array1[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++) {
			if(array1[j]<pivot) {
				i++;
				swap(array1,i,j);
			}
		}
		swap(array1,i+1,high);
		return (i+1);
	}

public static void swap(int[] array1,int i, int j) {
		int t=array1[i];
		array1[i]=array1[j];
		array1[j]=t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,33,2,45,7,9};
		int length=array.length;
		quicksort(array,0,length-1);
		for(int i=0;i<length;i++)
			System.out.println(array[i]);

	}
}
