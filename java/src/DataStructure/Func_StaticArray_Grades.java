package DataStructure;

public class Func_StaticArray_Grades {
         public static String getClassStats(int[] grades) {
             double sum = 0;
             int max = grades[0];
             int min = grades[0];
             int passing = 0;

             for (int grade : grades) {
                 sum += grade;
                 if (grade > max) {
                     max = grade;
                 }
                 if (grade < min) {
                     min = grade;
                 }
                 if (grade >= 60) {
                     passing++;
                 }
             }


            double average = sum / grades.length;

            return String.format("""
                            Class Average: %.1f
                            Highest Grade: %d
                            Lowest Grade: %d
                            Passing Grades: %d/%d""",
                    average, max, min, passing, grades.length);
        }

        public static String getLetterGrades(int[] grades) {
            int[] counts = new int[5];  // A, B, C, D, F

            for (int grade : grades) {
                if (grade >= 90) {
                    counts[0]++;
                }
                else if (grade >= 80) {
                    counts[1]++;
                }
                else if (grade >= 70) {
                    counts[2]++;
                }
                else if (grade >= 60){
                    counts[3]++;
                } else{
                    counts[4]++;
                }
            }

            return String.format("""
                            A (90-100): %d
                            B (80-89): %d
                            C (70-79): %d
                            D (60-69): %d
                            F (0-59): %d""",
                    counts[0], counts[1], counts[2], counts[3], counts[4]);
        }

        public static String getImprovement(int[] start, int[] end) {
            double totalImprovement = 0;
            int maxImprovement = 0;
            int improved = 0;

            for (int i = 0; i < start.length; i++) {
                int diff = end[i] - start[i];
                totalImprovement += diff;
                if (diff > maxImprovement) {
                    maxImprovement = diff;
                }
                if (diff > 0){
                    improved++;
                }
            }

            double avgImprovement = totalImprovement / start.length;

            return String.format("""
                            Average Improvement: %.1f points
                            Most Improved: %d points
                            Students Improved: %d/%d""",
                    avgImprovement, maxImprovement, improved, start.length);
        }
        public static void main(String[] args) {
            // Test data
            int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
            int[] startGrades = {72, 85, 68, 90, 77};
            int[] endGrades = {84, 90, 75, 92, 80};

            // Test getClassStats
            System.out.println("Class Statistics:");
            System.out.println(getClassStats(grades));

            // Test getLetterGrades
            System.out.println("\nGrade Distribution:");
            System.out.println(getLetterGrades(grades));

            // Test getImprovement
            System.out.println("\nImprovement Analysis:");
            System.out.println(getImprovement(startGrades, endGrades));
        }
    }

