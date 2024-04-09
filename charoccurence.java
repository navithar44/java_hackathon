package javahackathon;

import java.util.HashMap;
import java.util.Scanner;

public class charoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to display number of occurrence of all character
		Scanner sc=new Scanner(System.in); 
        System.out.println("enter the string");  
        String str=sc.nextLine();
     HashMap <Character,Integer> hMap = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
           if (hMap.containsKey(str.charAt(i))) {
              int count = hMap.get(str.charAt(i));
              hMap.put(str.charAt(i), ++count);
           } else {
              hMap.put(str.charAt(i),1);
           }
        }
        System.out.println(hMap);


	}

}
