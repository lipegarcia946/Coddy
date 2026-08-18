package StringOperation;

public class StringOperation_2 {
    public static String checkLength(String str){
        boolean islongEnough;
        islongEnough = str.length() >= 6;
        return "Username length: " + str.length() +"\n " + " Long enough: " + islongEnough;
    }
    public static String checkStart(String str){
        boolean startsWith = str.startsWith("user_");
        boolean endsWith = str.endsWith("admin");
        return "Username starts with: " + startsWith +"\n"+" and ends with: " + endsWith;
    }
    public static String modifyUsername(String str){
        String firstFive = str.substring(0, 5);
        String UpperCase = str.toUpperCase();
        return "First Five Chars: "+ firstFive + "\n" +"Uppercase: " + UpperCase;
    }
    public static void main(String[] args) {
        String username = "user_123admin";

        System.out.println("Length Check:");
        System.out.println(checkLength(username));

        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));

        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
