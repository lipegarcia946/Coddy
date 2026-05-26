package amateur;
import java.lang.Math.*;

public class Func_Param_OverOperator {
    public static int calculateArea(int a) {
        return (int) Math.pow(a,2);
    }
    public static int calculateArea(int a, int b) {
        return a *b;
    }
    public static int calculateArea(int r) {
        return r * ;
    }
    public static void main(String[] args) {
        // Test your methods with these exact values
        calculateArea(5);          // square
        calculateArea(4, 6);       // rectangle
        calculateArea(2.5);        // circle
    }
}
