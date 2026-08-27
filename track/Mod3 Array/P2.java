
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);

        double average = (double) sum / n;
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
