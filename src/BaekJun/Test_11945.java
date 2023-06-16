package BaekJun;

import java.util.Scanner;

public class Test_11945 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        for (int i = 0; i < a; i++) {
        	
            StringBuilder sb = new StringBuilder(sc.nextLine());
            
            System.out.println(sb.reverse());
        }
    }
}