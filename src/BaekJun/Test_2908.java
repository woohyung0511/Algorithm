package BaekJun;

import java.util.Scanner;

public class Test_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		a=Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b=Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		
		System.out.println(a>b?a:b);

		
	}

}