import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr []=new int[n];
		int arr2 []=new int[n];
		
		int tot=0;
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i=0;i<n;i++) {
			tot+=arr[i]*arr2[n-1-i];
		}
		System.out.println(tot);
	}

}
