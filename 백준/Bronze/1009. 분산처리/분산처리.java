import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int tot=1;
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			for(int j=0;j<b;j++) 
				tot=(tot*a)%10;
				if(tot==0)
					tot=10;
				System.out.println(tot);
			
		}
		
	}

}
