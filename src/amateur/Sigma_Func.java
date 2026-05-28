package amateur;

import java.util.Scanner;

public class Sigma_Func {
    public static int sigma(int n) {
        // Write your code below
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Para começar digite um valor: ");
        int n = scanner.nextInt();
        int res = sigma(n);
        // System.out.println("O Resultado da função Sigma é: " + res);
        System.out.println(res);

        scanner.close();
    }

}
