package BaekJun;

import java.util.Scanner;

public class Test_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();

		int c=(a/100)*100;
		
		while(true) {
			if(c%b==0) {
				int d=c%100;
				if(d<10) {
					System.out.println("0"+d);
				}else {
					System.out.println(d);
				}
				break;
			}else {
				c++;
			}
		}
		
	}

}
