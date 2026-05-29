package DataStructure;

public class StaticArray {
    public static void main(String[] args) {
        System.out.println("Shopping List:");
        String[] shoppingList = {"brad", "eggs", "milk", "butter"};

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
//
//        forma melhor para escrever essa lista
//        forech (String s : shoppingList) {
//            System.out.println(s);
//        }
        }
    }
}
