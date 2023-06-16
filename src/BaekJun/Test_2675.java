package BaekJun;

import java.util.Scanner;

public class Test_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		String b=a.toUpperCase();
		int [] cnt =new int [26];
		
		for(int i=0;i<b.length();i++) {
			
			int c=b.charAt(i)-'A';
			cnt[c]++;
		}
		
		int max=0;
		char ans= '?';
		
		for(int j=0;j<cnt.length;j++) {
			if(max<cnt[j]) {
				max=cnt[j];
				ans=(char)(j+'A');
			}else if(max==cnt[j]) {
				ans='?';
			}
		}
		System.out.println(ans);
		
	}

}
