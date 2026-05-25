package begginner;

public class Do_while_loop2 {

    public static void main(String[] args) {
        int number = 16;

        System.out.println("Starting countdown...");

        do {
            System.out.println("Number is: " + number);

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number - 1;
            }
        } while (number > 1);
        System.out.println("Final number is: " + number);
        System.out.println("Countdown finished!");

    }
}