package BaekJun;

import java.util.Scanner;

public class Test_2752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int max=Math.max(Math.max(a, b), c); 	
		int min=Math.min(Math.min(a, b), c);
		int mid=a+b+c-max-min;
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	}

}
