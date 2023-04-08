import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int N;
		int sum=1;
		
		N=sc.nextInt();

		while(N!=0)
		{
			sum*=N;
			N--;
		}
		
		System.out.println(sum);
	}

}
