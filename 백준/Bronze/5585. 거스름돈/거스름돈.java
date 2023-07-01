import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int b=1000-a;
		
		int tot=0;
		
		if(b>=500) {
			tot+=b/500;
			b-=(b/500)*500;
		}
		if(b>=100) {
			tot+=b/100;
			b-=(b/100)*100;
		}
		if(b>=50) {
			tot+=b/50;
			b-=(b/50)*50;
		}
		if(b>=10) {
			tot+=b/10;
			b-=(b/10)*10;
		}
		if(b>=5) {
			tot+=b/5;
			b-=(b/5)*5;
		}
		if(b>=1) {
			tot+=b/1;
			b-=(b/1)*1;
		}
		System.out.println(tot);
	}

}
