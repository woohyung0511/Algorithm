import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int mw=0;
		
		int arr []=new int [n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++) {
			int w=arr[i]*(n-i);
			if(w>mw) {
				mw=w;
			}
			
		}
		System.out.println(mw);
	}

}
