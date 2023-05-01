import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        for(int i=0;i<a;i++)
        {
        	while(sc.hasNext()) {
        		
        		StringBuilder sb=new StringBuilder(sc.next());
        		
        		System.out.println(sb.reverse());
        	}
        }
    }
}