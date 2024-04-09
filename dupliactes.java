package javahackathon;
import java.util.Scanner;
public class dupliactes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //WJP to display duplicate character in string
		Scanner sc=new Scanner(System.in); 
        System.out.println("enter the string");  
        String str=sc.nextLine();
        String dupch ="";
        for(int i=0;i<str.length();i++) {
        	for(int j=i+1;j<str.length();j++) {
        		if(str.charAt(i)==str.charAt(j)) {
        			String s=Character.toString(str.charAt(i));
        			if(!dupch.contains(s)) {
        				dupch= dupch+" "+str.charAt(i);
        			}
        			break;
        		}
        	}
        }
	System.out.println("Dupliacte characters are: "+dupch);
}
}
