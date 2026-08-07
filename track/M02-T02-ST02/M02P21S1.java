
import java.util.Scanner;

public class M02P21S1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        System.out.print("Age is " + age);
        System.out.println("Enter your height : ");
        float height = scan.nextFloat();
        System.out.println("your height : " + height);
        scan.nextLine();
        System.out.println("Enetr your full name : ");
        String fname = scan.nextLine();
        System.out.println("Full name is : " + fname);
    }
}
