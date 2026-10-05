import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        if (age > 0) {
            if (age > 18) {
                System.out.println("welcome to the website");
            }
            else {
                System.out.println("You are under 18 years old");
            }
        }
        else {
            System.out.println("invalid age");
        }

    }
}
