import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jah = scanner.nextLine();
        String doc = scanner.nextLine();

        if (jah.length() >= doc.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}