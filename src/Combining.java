import java.util.Scanner;

public class Combining {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of x");
        x = sc.nextInt();
        System.out.println("Enter the second number of y");
        y = sc.nextInt();
        if (x==6&&y==10){
            System.out.println("the value is correct");
        }
        else{
            System.out.println("the value is not correct");
        }
        if (x==4 || y==5) {
            System.out.println("The two numbers are the same");
        }
        else {
            System.out.println("The two numbers are not the same");
        }
    }
}
