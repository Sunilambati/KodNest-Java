
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int resultIndex = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                resultIndex = i;
                break;
            }
        }

        System.out.println(resultIndex);
        scanner.close();
    }
}
