package javahackathon;

public class reverstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a string print the reverse of the words string.
		String str="java code";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i] + " ");
				
		}
	}

}
