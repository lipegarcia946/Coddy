package begginner;

import java.util.Scanner;

public class Calculator_App3 {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Print the results
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);
        scanner.close();
    }
}
