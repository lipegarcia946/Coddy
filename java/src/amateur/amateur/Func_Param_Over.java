public class Func_Param_Over {
    // Write your calculateArea methods here
    public static int calculateArea(int a) {
        double base = (double) a;
        double exp = 2;
        return (int) Math.pow(base, exp);

    }

    public static int calculateArea(int a, int b) {

        return a * b;

    }

    public static double calculateArea(double rad) {
        final double PI = 3.14;
        return Math.pow(rad, 2) * PI;

    }

    public static void main(String[] args) {
        int SquarArea;
        int RetangArea;
        double CircleArea, rad = 2.5;// Test your methods with these exact values
        System.out.print("Calculando..........:\n");
        SquarArea = calculateArea(5); // square
        System.out.println("A area do quadrado:  " + SquarArea);
        RetangArea = calculateArea(4, 6);
        System.out.println("A area do retangulo:  " + RetangArea); // rectangle
        CircleArea = calculateArea(2.5); // circle
        System.out.printf("A area do Circulo com: %f  Area: %.2f  ", rad, CircleArea);
    }
}