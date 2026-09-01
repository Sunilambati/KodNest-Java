
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int element = 30;
        int indexToRemove = 2;
        int[] b = new int[a.length - 1];

        for (int i = 0; i < indexToRemove; i++) {
            b[i] = a[i];
        }

        b[indexToRemove] = element;

        for (int i = indexToRemove + 1; i < a.length; i++) {
            b[i - 1] = a[i];
        }

        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
