import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int cnt=0;
		int a=n;
		int b=1;
		
		while(a>0) {
			if(b<=a) {
				a-=b;
				b++;
				cnt++;
			}else {
				b=1;
			}
		}
		System.out.println(cnt);
	}

}
