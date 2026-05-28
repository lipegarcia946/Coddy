package begginner;

import java.util.Scanner;
public class True_or_False {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String w = sc.nextLine();
             if (w.equals("1")) {
                 System.out.println("T");
        } else {
            System.out.println("F");

        }

        sc.close();
    }
}
