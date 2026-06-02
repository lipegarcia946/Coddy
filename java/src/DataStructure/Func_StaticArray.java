package DataStructure;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Func_StaticArray {

    public static String[] merge(String[] arr1, String[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = len1 + len2;
        String[] arr3 = new String[len3];

        System.arraycopy(arr1, 0, arr3, 0, len1);
        System.arraycopy(arr2, 0, arr3, len1, len2);

        sort(arr3);

        return arr3;
    }


    public static void main(String[] args) {
        System.out.print("Para começar , Digite 2 conjuntos de valores:  ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("1º Conjunto de valores: \n");
        String textArr1 = scanner.nextLine();
        System.out.print("2º Conjunto de valores:\n ");
        String textArr2 = scanner.nextLine();

        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(" O Conjunto de valores resultantes é : " +Arrays.toString(mergedArray));
    }
}
