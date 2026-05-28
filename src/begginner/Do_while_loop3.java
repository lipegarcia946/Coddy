package begginner;

public class Do_while_loop3 {
    public static void main(String[] args) {
        double balance = 1000.00;
        double yearlyDeposit = 500.00;
        double interestRate = 0.05;
        double targetAmount = 5000.00;
        int years = 0;
        while (balance < targetAmount) {

            years++;
            balance += yearlyDeposit;
            balance += (balance * interestRate);
            System.out.printf("Year %d: $%.2f\n", years, balance);
        }
        System.out.println("------------------------");
        System.out.println("Goal reached in " + years + " years!");
        System.out.printf("Final balance: $%.2f", balance);
    }
}
