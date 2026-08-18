package StringOperation;

public class StringOperation_4 {
    public static String formatCourseInfo(String courseInfo) {
        String[] parts = courseInfo.split(":");
        return "Course Code: " + parts[0] + "\n" +
                "Course Name: " + parts[1] + "\n" +
                "Days: " + parts[2] + "\n" +
                "Time: " + parts[3];
    }

    public static String createCourseList(String[] courseCodes) {
        return "Available Courses: " + String.join(", ", courseCodes);
    }

    public static String formatSchedule(String days) {
        String[] dayArray = days.split(",");
        return String.join(" | ", dayArray);
    }


    public static void main(String[] args) {
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";

        // Teste seus métodos
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));

        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));

        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));

    }
}
