package basics;

public class addelement 
{
	//insert element into specified position in an array
	public static void main(String[] args) 
	{
		int[] array= {1,5,7,8,9,3,2};
		for(int i=0;i<array.length;i++)
		{
			array[3]=22;
			array[4]=19;
			array[0]=43;
			System.out.print(array[i] +" ");
		}
	}
}