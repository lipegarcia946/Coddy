package amateur;

public class Event_schedule {
    public static void printHeader(){
        System.out.println("=============================");
        System.out.println("Events Schedule");
        System.out.println("=============================");
    }
    public static void printFooter(){
        System.out.println("=============================");
        System.out.println("   Thank You!      ");
        System.out.println("=============================");
    }
    public static void printEvent(){
        System.out.println(">> Main Event <<");
        System.out.println("Time: 7:00 PM ");
        System.out.println("Location: Hall A");
    }
    public static void main(String[] args) {
        printHeader();
        printEvent();
        printEvent();
        printEvent();
        printEvent();
        printFooter();
    }
}
