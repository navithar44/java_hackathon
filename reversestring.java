package javahackathon;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a string print the reverse of the string.
		String str="java code";
		String nstr = "";
		char ch;
		for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
		
		

	}


