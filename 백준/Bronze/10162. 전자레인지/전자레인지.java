import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		int A=300;
		int B=60;
		int C=10;
		
		if(T%10<10 && T%10!=0) {
			System.out.println(-1);
		}else {
			int a=T/A;
			int b=(T-(A*a))/B;
			int c=(T-((A*a)+(B*b)))/C;
			System.out.print(a+" "+b+" "+c);
		}
	}

}
