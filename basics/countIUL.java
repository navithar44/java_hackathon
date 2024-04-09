package basics;

public class countIUL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count integers,upper case,lower case
		String str="Hello Java 8";
        int upper = 0, lower = 0, number = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
           
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
}
}