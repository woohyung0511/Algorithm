import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = findMinOperations(A, B);

        System.out.println(result);
    }

    public static int findMinOperations(int A, int B) {
        int count = 0;
        
        while (B > A) {
            if (B % 2 == 0) {
                B /= 2;
            } else if (B % 10 == 1) {
                B /= 10;
            } else {
                return -1; // 바꿀 수 없는 경우
            }
            count++;
        }

        return (B == A) ? (count + 1) : -1;
    }
}
