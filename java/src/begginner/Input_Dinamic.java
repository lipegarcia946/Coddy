package begginner;

import java.util.Scanner;

public class Input_Dinamic {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int num;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            soma += num;
        }
        scanner.close();
        System.out.println("Soma Final " + soma);
    }
}
