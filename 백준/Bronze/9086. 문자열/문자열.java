import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			String b=sc.next();
			
			String one=String.valueOf(b.charAt(0));
			String two=String.valueOf(b.charAt(b.length()-1));
			
			System.out.println(one+two);
		}
	}

}
