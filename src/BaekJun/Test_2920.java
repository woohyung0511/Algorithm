package BaekJun;

import java.util.Scanner;

public class Test_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int arr []= new int [8];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] =sc.nextInt();

			}
		
		String rst="";
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]-1) {
				rst="ascending";
			}else if(arr[i]==arr[i+1]+1) {
				rst="descending";
			}else {
				rst="mixed";
			}
		}
		System.out.println(rst);
		
	}

}
