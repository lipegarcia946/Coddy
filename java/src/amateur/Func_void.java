package amateur;

import java.util.Scanner;

public class Func_void {
    public static void printNTimes(String message, int n) {
        for (int i = 0; i <n; i++ ) {
            System.out.println(message);
        }
            // Write you code here
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        int n = scanner.nextInt();

        printNTimes(msg, n);
        scanner.close();
    }
}
