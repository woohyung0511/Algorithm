import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		String b=sc.next();
		int total=0;
		
		for(int i=0;i<a;i++)
		{
			int c=b.charAt(i);
			total+=c-'0';
		}
		System.out.println(total);
	}

}
