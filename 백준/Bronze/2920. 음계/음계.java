import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
        sc.close();
        
        String rst = "";
        for (int i = 0; i < arr.length - 1; i++) {
        	if (arr[i] == arr[i + 1] - 1) {
            	rst = "ascending";
			} else if (arr[i] == arr[i + 1] + 1) {
            	rst = "descending";
            } else {
            	rst = "mixed";
                break;
            }
        }
        System.out.println(rst);
    }
}