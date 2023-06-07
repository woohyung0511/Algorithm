import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			int N=sc.nextInt();
			int Y=N%H;
			int X=N/H+1;
			
			if(N%H==0) {
				Y=H*100;
			}else {
				Y=(N%H)*100;
			}
			
			if(N%H==0) {
				X=N/H;
			}else {
				X=(N/H)+1;
			}
			System.out.println(Y+X);
		}
	}

}
