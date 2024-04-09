package basics;

public class Rectangle {
	public static int area(int l,int b)
	{
		int a=l*b;
		System.out.println("area of rectangle is:" +a);
	    return a;
	}
	public static void print(int l,int b)
	{
		System.out.println("length of the rectangle is:" +l);
		System.out.println("breadth of the rectangle is:" +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rectangle r=new Rectangle();
     r.area(4,5);
     r.print(4,5);
     r.area(5,8);
    r.print(5,8);
	}

}
