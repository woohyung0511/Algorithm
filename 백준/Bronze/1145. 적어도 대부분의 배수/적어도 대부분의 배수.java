import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int [] arr=new int [5];
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();

		}
		
		int cnt=0;
		int val=1;
		
		while(true) {
			for(int i=0;i<5;i++) {
				if(val%arr[i]==0) {
					cnt++;
				}
			}
			if(cnt>=3) {
				System.out.println(val);
				return;
			}
			cnt=0;
			val++;
		}
	}
}
