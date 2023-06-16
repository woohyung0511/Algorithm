package BaekJun;

import java.util.Scanner;

public class Test_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int arr [] =new int [26];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = -1;
		}
		
		String S=sc.next();
		
		for(int i=0;i<S.length();i++) {
			
			char a=S.charAt(i);
			
			
			if(arr[a - 'a']==-1) {
				arr[a-'a']=i;
			}
			
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		
	}

}
