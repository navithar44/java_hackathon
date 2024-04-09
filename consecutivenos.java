package javahackathon;
import java.util.Scanner;
public class consecutivenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		for(int i=1;i<num;i++ ) {
			int sum=0;
			int x=i;
			String sumComb="";
			while(sum<num) {
				sum=sum+x;
				sumComb=sumComb+x+"+";
				x++;
			}
			if(sum==num) {
				System.out.println(sumComb.substring(0, sumComb.length()-1));
			}
		}

	}

}
