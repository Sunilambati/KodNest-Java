
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;

        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
