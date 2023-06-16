package BaekJun;

import java.util.Scanner;

public class Test_1264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			String a=sc.nextLine();
			int count=0;
			
			if(a.equals("#"))
				 break;
			
			for(int i=0;i<a.length();i++)
			{
				char b=a.charAt(i);
			
				if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O' || b=='U')
					count++;
			}
			System.out.println(count);
		}
		
	}

}
