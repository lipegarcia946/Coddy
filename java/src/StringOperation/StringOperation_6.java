package StringOperation;

public class StringOperation_6 {
    public static void main(String[] args) {
        // Inicialize as variáveis - não modifique essas!
        String studentName = "john smith";
        int studentId = 123;
        double mathGrade = 92.5555;
        double scienceGrade = 88.7777;
        double englishGrade = 95.1111;
        double attendance = 0.8523;

        // Crie suas strings formatadas
        String[] nameParts = studentName.split(" ");
        String formattedName = String.format("%s %s", nameParts[0].substring(0,1).toUpperCase() + nameParts[0].substring(1),
                nameParts[1].substring(0,1).toUpperCase() + nameParts[1].substring(1));

        String headerInfo = String.format("Student: %s, ID: %05d", formattedName, studentId);

        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f", mathGrade, scienceGrade, englishGrade);

        String attendanceInfo = String.format("Attendance: %.1f%%", attendance * 100);

        // Não modifique o código abaixo
        System.out.println("STUDENT REPORT CARD");
        System.out.println("------------------");
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
    }
}
