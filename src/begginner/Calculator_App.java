package begginner;
import java.util.Scanner;

public class Calculator_App {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        sc.close();


    }
}
