import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered numbers.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered numbers.
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        // Stores the smallest number.
        int small = 0;

        // Checks if n1 is the smallest.
        if (n1 < n2 && n1 < n3) {
            small = n1;
        }

        // Checks if n2 is the smallest.
        else if (n2 < n1 && n2 < n3) {
            small = n2;
        }

        // Checks if n3 is the smallest.
        else if (n3 < n1 && n3 < n2) {
            small = n3;
        }

        // Prints the smallest number.
        System.out.println("The smallest number entered is " + small);
    }
}