package amateur;
import java.util.Scanner;
public class Func_Pararm_2 {
    public static double bigger(double arg1, double arg2) {
            if (arg1 > arg2) {
                return arg1;
            } else {
                return arg2;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Para Começar digite a quantidade de execuções que deseja realizar:\n ");
            int iterations = scanner.nextInt();
            System.out.println("Digite um valor, real: ");
            double num1 = scanner.nextDouble();
            System.out.println("Digite outro valor, real: ");
            double num2 = scanner.nextDouble();

            for (int i = 0; i < iterations; i++) {
                System.out.printf("[%da.] iteração:\n ", i+1);
                if (num1 < 2 || num2 < 2) {
                    break;
                }
                double big = bigger(num1, num2);
                if (big == num1) {
                    num1 /= 2;
                    System.out.println("Novo valor: " + num1);
                } else {
                    num2 /= 2;
                    System.out.println("Novo valor:" + num2);
                }
            }
        }
    }