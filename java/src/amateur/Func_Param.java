package amateur;

import java.util.Scanner;

public class Func_Param {
    public static int CalcProd(int n1, int n2) {
        int prod = n1 * n2;
        return prod;
    }

    public static void main(String[] args) {
        int resp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois valores, para calcular o produto\n");
        System.out.println("Digite o 1º valor:");
        int a = scanner.nextInt();
        System.out.println("Digite o 2º valor:");
        int b = scanner.nextInt();
        // Call the method with a and b as arguments
        resp = CalcProd(a, b);
        // System.out.println(resp);
        System.out.println("O produto entre a = " + a + " e b = " + b + " é: " + resp);
        scanner.close();
    }
}
