import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int cnt=1;
		int ran=2;
		
		if(N==1) {
			System.out.println(1);
		}else {
			while(ran<=N) {
				ran=ran+(6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
