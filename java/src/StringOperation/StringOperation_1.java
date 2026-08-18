package StringOperation;

import java.util.Scanner;
public class StringOperation_1 {
        public static void analyzeString(String str) {
            // Escreva seu código aqui
            System.out.println("Length: " + str.length());
            System.out.println("Char at 4: " + str.charAt(4));
            System.out.println("Substring: " + str.substring(7));
            System.out.println("Substring 2: " + str.substring(3,6));
            System.out.println("Ends with dot: " + str.endsWith("."));
            System.out.println("Uppercase:" + str.toUpperCase());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            analyzeString(message);
        }
    }

