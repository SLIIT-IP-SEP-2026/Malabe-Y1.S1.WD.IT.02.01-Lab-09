import java.util.Scanner;
import java.util.Scanner;

public class IT26510618Lab9Q4 {

    // Method to calculate final mark
    public static double calcFinalMark(double assignment, double exam) {
        double finalMark = (assignment * 0.30) + (exam * 0.70);
        return finalMark;
    }

    // Method to find grade
    public static String findGrades(double mark) {

        if (mark >= 75) {
            return "A";
        }
        else if (mark >= 60) {
            return "B";
        }
        else if (mark >= 50) {
            return "C";
        }
        else {
            return "F";
        }
    }

    // Method to print student details
    public static void printDetails(String name, double mark, String grade) {

        System.out.printf("%-15s %-15.2f %-10s%n",
                name, mark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double assignment, exam, finalMark;
        String grade;

        System.out.println("Name           Final Mark     Grade");

        // Get details of 5 students
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            exam = input.nextDouble();

            input.nextLine();

            finalMark = calcFinalMark(assignment, exam);

            grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}