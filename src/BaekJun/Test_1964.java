package BaekJun;

import java.util.Scanner;

public class Test_1964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		long a=5;
		int b=45678;
		
		if(n==1) {
			System.out.println(a%b);
		}else {
			
			for(int i=1;i<n;i++) {
				
				a=a+(3*i)+4;
							
			}
			System.out.println(a%b);
		}

	}

}
