import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			String a=sc.nextLine();
			
			if(a.equals("END"))
				break;
			
			StringBuilder rev=new StringBuilder();
			
			for(int i=a.length()-1;i>=0;i--)
			{
				rev.append(a.charAt(i));
			}
			System.out.println(rev.toString());
			

		}
	}

}
