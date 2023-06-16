package BaekJun;

import java.util.Scanner;

public class Test_2355 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		long A=sc.nextInt();
		long B=sc.nextInt();
		
		long min=Math.min(A, B);
		long max=Math.max(A, B);
		
		long res=((max-min+1) * (max+min))/2;
		
		System.out.println(res);
	}

}
