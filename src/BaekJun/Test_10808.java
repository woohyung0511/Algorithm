package BaekJun;

import java.util.Scanner;

public class Test_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[26];
		
		String a=sc.nextLine();
		
		for(int i=0;i<a.length();i++)
		{
			char b=a.charAt(i);
			
			if(b>='a' && b<='z')
			{
				arr[b-'a']++;
			}
		}
		
		for(int i=0;i<26;i++)
		{
			System.out.println(arr[i]);
		}
	}
}