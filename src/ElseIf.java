import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        int salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = input.nextInt();
        if (salary < 5000) {
            System.out.println("No taxes added");
        }
        else if (salary <6000 ) {
            System.out.println("10% taxes added");
        }
        else if (salary >7000 ) {
            System.out.println("25% taxes added");
        }
    }
}
