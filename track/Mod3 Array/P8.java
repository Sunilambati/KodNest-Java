
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int newElement = 90;

        // Step 1: Create a new array with size = original length + 1
        int[] newArray = new int[a.length + 1];

        // Step 2: Copy all elements from original array to new array
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        // Step 3: Place the new value at the last position
        newArray[newArray.length - 1] = newElement;

        // Step 4: Reassign reference 'a' to 'newArray'
        a = newArray;

        System.out.println(Arrays.toString(a));
    }
}
