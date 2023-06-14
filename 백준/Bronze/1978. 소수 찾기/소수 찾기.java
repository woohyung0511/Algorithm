import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			
			int a=sc.nextInt();
			
			for(int j=2;j<=a;j++) {
				
				if(j==a) {
					cnt++;
				}
				
				if(a%j==0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
