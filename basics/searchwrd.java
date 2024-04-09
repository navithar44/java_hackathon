package basics;

public class searchwrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// search for word ="qa"
      String s1="I am learning qa automation testing" ;
      String ch="qa";
      System.out.println("Given string:"+s1);
       if(s1.contains(ch)) 
    	  System.out.println("The word "+ ch+" is found");
       else
    	 System.out.println("word not found");
    	 
      }
	}


