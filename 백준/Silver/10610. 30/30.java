import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String n=sc.next();
		
		int tot=0;
		
		int arr[] =new int [n.length()];
		
		for(int i=0;i<n.length();i++) {
			arr[i]=n.charAt(i)-'0';
			tot+=arr[i];
		}
		Arrays.sort(arr);

		if(tot%3==0 && arr[0]==0) {
			for(int i=n.length()-1;i>-1;i--) {
				System.out.print(arr[i]);
			}
		}else {
			System.out.println(-1);
		}
	}
}

