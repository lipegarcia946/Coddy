package begginner;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        while (num >= 3.5) {
            num /= 2;
        }
        System.out.println("resp:" + num);
        sc.close();
    }
}
