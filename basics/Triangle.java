package basics;
import java.util.*;
import java.lang.Math;

public class Triangle {
	
	 public static double area(double a,double b,double c) 
	 {
	  double p=(a+b+c);
	  System.out.print("perimeter of the triangle is:" +p);
	  System.out.println();
	  double s=p/2;
	 double w=(s*(s-a)*(s-b)*(s-c));
	 System.out.println(Math.sqrt(w));
	return w;
	
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Triangle t=new Triangle();
 t.area(3,4,5);
  
  
		
	}

}
