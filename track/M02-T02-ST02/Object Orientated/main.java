
public class Main {

    public static void main(String[] args) {
        StudentApplication s1 = new StudentApplication();
        s1.roll = 1;
        s1.name = "John";
        s1.height = 5.5;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();

        StudentApplication s2 = new StudentApplication();
        s2.roll = 2;
        s2.name = "rani";
        s2.height = 5.8;
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);
        s2.run();
        s2.sleep();
    }
}
