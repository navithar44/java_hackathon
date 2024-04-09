package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class indexelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array= new int[5];
     int element=0;
     ArrayList<String> list = new ArrayList<>();
    list.add("orange");
    list.add("mango");
    list.add("banana");
    list.add("grapes");
    list.add("pineapple");

Scanner s=new Scanner(System.in);
System.out.println("enter the element to find the index of it:");
String name = s.nextLine();
for(int i=0;i<array.length;i++)
{
element=list.indexOf(name);
}
System.out.println("The index of element in the array list is:" +element);
}}