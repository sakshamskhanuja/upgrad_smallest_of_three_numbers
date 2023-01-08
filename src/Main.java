import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered numbers.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered numbers.
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        // Checks if n1 is smaller than n2.
        if (n1 < n2) {
            // Checks if n1 is smaller than n3.
            if (n1 < n3) {
                System.out.println("The smallest number entered is " + n1);
            } else {
                System.out.println("The smallest number entered is " + n3);
            }
        } else {
            // Checks n2 is smaller than n3.
            if (n2 < n3) {
                System.out.println("The smallest number entered is " + n2);
            } else {
                System.out.println("The smallest number entered is " + n3);
            }
        }
    }
}