package StringOperation;
import java.util.Scanner;

public class StringOperation_5 {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        double newQuantity = quantity;
        return String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, newQuantity, unitPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
        scanner.close();
    }
}