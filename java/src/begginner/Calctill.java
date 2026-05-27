package begginner;
import java.util.Scanner;

public class Calctill {

          public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            // Write your code below
            System.out.print("digite um valor para calcular o tempo faltante: ");
            int age = scanner.nextInt();
            int calc = (120 - age);
            System.out.printf("%d years till 120", calc);
            scanner.close();
        }
    }
