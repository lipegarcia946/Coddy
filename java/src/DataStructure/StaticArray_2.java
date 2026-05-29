package DataStructure;

public class StaticArray_2 {
    public static void values(int[] arr) {
        // Write code here
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        //outra forma de mostrar os elementos
//        for(int el :arr) {
//            System.out.println(el);
//        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        values(numbers);
    }
}
