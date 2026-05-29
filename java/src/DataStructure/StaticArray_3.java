package DataStructure;
import java.util.Scanner;
public class StaticArray_3 {
    public static String[] changeElement(String[] arr, int index, String newElement) {
        // Write code here

        String[] modifArray;
        modifArray = arr;
        for(int i=0;i< modifArray.length;i++) {
            if(modifArray[i].equals(arr[index]) ) {
             modifArray[i] = newElement;
        }
    }
        return modifArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArray = scanner.nextLine();
        int index = scanner.nextInt();
        scanner.nextLine();
        String newElement = scanner.nextLine();
        String[] arr = textArray.split(",");
        String[] modifiedArr = changeElement(arr, index, newElement);
        for (int i = 0; i < modifiedArr.length; i++) {
            System.out.print(modifiedArr[i] + " ");
        }
    }
}
