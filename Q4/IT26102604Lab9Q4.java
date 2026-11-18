import java.util.Scanner;
import java.util.Scanner;

public class IT26102604Lab9Q4 {

    
    public static double calcFinalMark(double assignment, double exam) {
        double finalMark = (assignment * 0.30) + (exam * 0.70);
        return finalMark;
    }

    
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

        
    }
}
