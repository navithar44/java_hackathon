package basics;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //largest of 3 nos using if-else if
        int x=3,y=8,z=6;
        
        if(x>=y && x>=z) {
        	 System.out.println("The largest no is "+  x);
        }
        else if(y>=x && y>=z) {
        	System.out.println("The largest no is "+  y);
        }
        else
        
        System.out.println("The largest no is "+  z); 
        
      //largest of 3 nos using nested-if
        
int x1=5,y1=10,z1=15;

if (x1 >= y1) 
{
    if (x1 >= z1)
        System.out.println("The largest number is " + x1);
}
else if (y1 >= x1) 
{
	if(y1>=z1)

    System.out.println("The largest number is " + y1);		
else
    System.out.println("The largest number is " + z1);
}


}

	}

