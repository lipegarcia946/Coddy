package begginner;

public class For_Table {
    public static void main(String[] args) {
            // Initialize variables
            int number = 7;
            int sum = 0;

            System.out.println("Multiplication Table for " + number);
            System.out.println("---------------------------");

            for(int i=1; i<=12; i++){
                int prod = (number * i);
                System.out.println(number + "X" + i + "=" + prod);
                sum+=prod;
            }


            System.out.println("---------------------------");
            System.out.println("Sum of all results: " + sum);
    }
}
