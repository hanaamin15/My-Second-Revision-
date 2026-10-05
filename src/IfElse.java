import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = sc.nextInt();
        if (age >13) {
            System.out.println("You are eligible to register");

        }
        else {
            System.out.println("You are too young to register");
        }
    }
}
