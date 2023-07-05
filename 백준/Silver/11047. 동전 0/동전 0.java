import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int money=sc.nextInt();
		
		int arr[]=new int [n];
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++) {
			if(money/arr[n-1-i]>=1) {
				cnt+=money/arr[n-1-i];
				money=money%arr[n-1-i];
			}
		}
		System.out.println(cnt);
	}

}
