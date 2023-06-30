import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int Pirodo=sc.nextInt();
		int Work=sc.nextInt();
		int Decrease=sc.nextInt();
		int Maxpirodo=sc.nextInt();
		
		int Tpirodo=0;
		int Twork=0;	
		
		for(int i=0;i<24;i++) {
			if(Tpirodo+Pirodo<=Maxpirodo) {
				Twork+=Work;
				Tpirodo+=Pirodo;
			}else {
				Tpirodo-=Decrease;
				if(Tpirodo<0) {
					Tpirodo=0;
				}
			}	
		}
		System.out.println(Twork);
	}

}
