package BaekJun;

import java.util.Scanner;

public class Test_5554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int total=a+b+c+d;
		
		int min=total/60;
		int sec=total%60;
		
		System.out.println(min);
		System.out.println(sec);
	}

}
