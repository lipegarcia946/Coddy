import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
public class Func_StaticArray_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                count++;
            }
        }

        String[] newArr = new String[count];

        int newArrIndex = 0;
        for (String word : arr) {
            if (word.length() > 5) {
                newArr[newArrIndex] = word;
                newArrIndex++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}