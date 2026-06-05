package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Func_StaticArray_inverter {
    public static int[] reverse(int[] arr) {
        // Write your code below
        int [] reverse = new int[arr.length];
         for (int i = 0; i < arr.length; i++) {
            reverse[i]  = arr[arr.length-1-i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        int[] result = reverse(arr);
        System.out.println("The reversed array is: " + Arrays.toString(result));
        scanner.close();
    }

}
