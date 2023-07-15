import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=1;
		
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			if(b==n){
				n=c;
			}else if(c==n) {
				n=b;
			}
		}
		System.out.println(n);
	}

}
