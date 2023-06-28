import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			
			int A=0;
			int B=0;
			int C=0;
			int D=0;
			
			if(b>=25) {
				A=b/25;
				b-= 25*A;
			}
			if(b>=10) {
				B=b/10;
				b-=10*B;
			}
			if(b>=5) {
				C=b/5;
				b-=5*C;
			}
			if(b>=1) {
				D=b/1;
				b-=1*D;
			}
			System.out.print(A+" "+B+" "+C+" "+D);
			System.out.println();
		}
	}

}
