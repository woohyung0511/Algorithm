import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int num=a*b*c;
		
		String strNum=Integer.toString(num);
		
		
		for(int i=0;i<10;i++) {
			int count=0;
			
			for(int j=0;j<strNum.length();j++)
			{
				if((strNum.charAt(j)-'0')==i)
				{
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}
