import java.util.Scanner;
public class IT26101967Lab9Q4 {
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (30 * assignmentMark + 70 * examMark) / 100;
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-18s %-14.2f %c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int studentCount = 5;
        String[] names = new String[studentCount];
        double[] finalMarks = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double examMark = input.nextDouble();

            input.nextLine(); // Consume the newline before reading the next name.
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            System.out.println();
        }

        System.out.printf("%-18s %-14s %s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < studentCount; i++) {
            char grade = findGrades(finalMarks[i]);
            printDetails(names[i], finalMarks[i], grade);
        }
    }
}