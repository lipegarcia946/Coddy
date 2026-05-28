package amateur;

import java.util.Scanner;

public class Check_Func {
    public static boolean is_valid(String username, String password) {
        // Write your code below
        boolean result = false;
        if (username.equals("user") && password.equals("qweasd")) {
            result = true;
        } else if (username.equals("admin")) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        boolean res = is_valid(user, pass);
        System.out.println(res);
        scanner.close();
    }
}
