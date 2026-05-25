package begginner;

public class Do_while_loop {
    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;
        int number = 1;
        do {
            sum += number;
            number += 2;
            System.out.println("Sum is: " + sum);
            System.out.println("Num is: " + number);
        } while (number <= 50);

        // Print the final sum
        System.out.println("Final Sum: " + sum);
    }
}