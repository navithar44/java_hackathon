package javahackathon;
public class reversenumbersinarray {
	public static void reverse_array(int[] Array,int k) {
		int len=Array.length;
		for( int i=0;i<Array.length;i=i+k){
			int start=i;
			int end=Math.min(i+k-1, len-1);
			while(start<=end) {
				
				int temp=Array[start];
				Array[start]=Array[end];
				Array[end]=temp;
				start++;
				end--;
	}
		} 
	}		
	 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be  based on VAR k. 
		 Array = [3,2,4,7,0,3,1,5,8, 4]
				 k=3       
				 OutPut =
				 [4,2,3,3,0,7,8,5,1,4]*/
	int[] Array= {3,2,4,7,0,3,1,5,8, 4};
	int k=3;
	reverse_array(Array,k);
	
	for(int val :Array) {
	System.out.print(val+ " ");
	
}}}
