package basics;

public class reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Java",nrev="";
  System.out.println("original string:" +str);
  char rev = 0;
  for(int i=0;i<str.length();i++)
  {  rev=str.charAt(i);
      nrev=rev+nrev;
	}
  System.out.println("Reversed string is:"+ nrev);

}
}