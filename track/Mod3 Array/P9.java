
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {10, 20, 40, 50};
        int newElement = 30;
        int index = 2;

        int[] b = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        b[index] = newElement;

        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }

        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
