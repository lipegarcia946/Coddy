package StringOperation;

import java.util.Scanner;
public class StringOperation_7 {


    public static void compareStrings(String str1, String str2) {
        boolean eq1 = str1.equals(str2);
        System.out.println(str1 + " equals " + str2 + ":" + eq1);
        boolean eq2 = str1.equalsIgnoreCase(str2);
        System.out.println(str1 + " IgnoreEqualsCase " + str2 + ":" + eq2);
        int comp1 = str1.compareTo(str2);
        System.out.println(str1 + " Compare to " + str2 + ":" + comp1);
        int comp2= str1.compareToIgnoreCase(str2);
        System.out.println(str1 + " Compare to IgnoreCase " + str2 + ":" + comp2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1ª frase ou palavra: ");
        String str1 = scanner.nextLine();
        System.out.println("2ª frase ou palavra: ");
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}

