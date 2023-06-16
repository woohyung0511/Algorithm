package BaekJun;

import java.util.Scanner;

public class Test_1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int cnt=0;
		for(int i=0;i<8;i++) {
			
			String a=sc.next();
			
			for(int j=0;i<8;j++) {
				if((i+j)%2==0 && a.charAt(j)=='F')
					cnt++;
			}
		}
		System.out.println(cnt);
	}

}
