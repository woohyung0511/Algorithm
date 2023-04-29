import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int max=0;
		int mid=0;
		int min=0;
		
		if(a>b && a>c) {
			max=a;
			if(b>c) {
				mid=b;
				min=c;
			}else {
				mid=c;
				min=b;
			}
		}
			
		else if(b>a && b>c) {
			max=b;
			if(a>c) {
				mid=a;
				min=c;
			}else {
				mid=c;
				min=a;
			}
		}
			
		else if(c>a && c>b) {
			max=c;
			if(a>b) {
				mid=a;
				min=b;
			}else {
				mid=b;
				min=a;
			}
		}
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	}

}
