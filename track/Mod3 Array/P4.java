
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int minimum = a[0];
        int maximum = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }

        System.out.println(minimum + " " + maximum);
        scanner.close();
    }
}
