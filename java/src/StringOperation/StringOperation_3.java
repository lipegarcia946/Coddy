package StringOperation;
import java.util.Arrays;
import java.util.Scanner;

class StringOperation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        String[] res = text.split(" ");
        String joinedString = String.join(delimiter, res);
        System.out.println(joinedString);
        scanner.close();
    }
}
