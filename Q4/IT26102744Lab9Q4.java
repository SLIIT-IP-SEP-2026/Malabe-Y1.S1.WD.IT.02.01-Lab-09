import java.util.Scanner;

public class IT26102744Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.3 + exam * 0.7;
    }

    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double mark, char grade) {
        System.out.printf("%-15s %-15.2f %c%n", name, mark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] finals = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();

            finals[i] = calcFinalMark(assignment, exam);
        }

        System.out.println();
        System.out.printf("%-15s %-15s %s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finals[i], findGrades(finals[i]));
        }
        sc.close();
    }
}
