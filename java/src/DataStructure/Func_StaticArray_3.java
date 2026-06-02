package DataStructure;

import java.util.Arrays;

public class Func_StaticArray_3 {
    public static String[] createSeatingChart(String[] names, int[] grades) {
        String[] chart = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            chart[i] = names[i] + ": " + grades[i];
        }
        Arrays.sort(chart);
        return chart;
    }

    public static String[] findTopStudents(int[] grades) {
        String[] letters = new String[grades.length];
        for (int i = 0; i < grades.length; i++) {
            letters[i] = (grades[i] >= 90) ? "A+" : "A";
        }
        return letters;
    }

    public static boolean isClassEqual(int[] grades1, int[] grades2) {
        return Arrays.equals(grades1, grades2);
    }

    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85, 92, 78};

        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));

        // Test second method
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));

        // Test third method
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }
}


