package BaekJun;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("black");
		list.add("brown");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("green");
		list.add("blue");
		list.add("violet");
		list.add("grey");
		list.add("white");	
		
		int a=list.indexOf(sc.nextLine())*10;
		int b=list.indexOf(sc.nextLine());
		int c=list.indexOf(sc.nextLine());
		
		System.out.println((long)((a+b)*Math.pow(10, c)));
	}
	
}
