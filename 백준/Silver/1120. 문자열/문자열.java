import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		String b=sc.next();
		
		int res=a.length();
		
		for(int i=0;i<b.length()-a.length()+1;i++) {
			int tmp=0;
			
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j)!=b.charAt(j+i)) {
					tmp++;
				}
			}
			if(res>tmp) {
				res=tmp;
			}
		}
		System.out.println(res);
	}

}
