import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int arr []=new int [a];
		
		int sum=0;
		int tot=0;
		
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			arr[i]=b;
		}
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			tot+=sum+arr[i];
			
			sum+=arr[i];
		}
		System.out.println(tot);
	}

}
