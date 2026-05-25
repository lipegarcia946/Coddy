package amateur;

import java.util.Scanner;

public class Numbers {
    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Numbers num = new Numbers();
        for (int i = 0; i < n; i++) {
            System.out.println(num.sumNumbers());
        }
        scanner.close();
    }


}
