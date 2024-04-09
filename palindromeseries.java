package javahackathon;
import java.util.Scanner;
public class palindromeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		String longestPalindrome =findLongestPalindrome(input);
		System.out.println("Longest Palindrome: " +longestPalindrome);
		sc.close();
	}
		
		public static String findLongestPalindrome(String input) {
			if(input==null || input.length()==0)
			{
				return "";
			}
			int maxLength=0;
			String longestPalindrome="";
			for(int i=0;i< input.length();i++) {
				for(int j=i+1;j<=input.length();j++)
				{
					String substr = input.substring(i,j);
					if(isPalindrome(substr) && substr.length()>maxLength) {
						maxLength=substr.length();
						longestPalindrome=substr;
					}
				}
			}
			return longestPalindrome;
		}

		public static boolean isPalindrome(String str) {
			int left=0;
			int right=str.length()-1;
			
			while(left<right) {
				if(str.charAt(left++) !=str.charAt(right--)) {
					return false;
				}
			}
			return true;
		

				}
			}
		

	


