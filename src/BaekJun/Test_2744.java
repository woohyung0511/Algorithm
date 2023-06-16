package BaekJun;

import java.util.Scanner;

public class Test_2744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			
			if(Character.isUpperCase(c))
			{
				System.out.print(String.valueOf(c).toLowerCase());
			}else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}

}
