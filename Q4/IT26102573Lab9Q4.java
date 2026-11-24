import java.util.Scanner;

public class IT26102573Lab9Q4 {

    public static double calcFinalMark(int assignmentMark, int examPaperMark) {
        return (assignmentMark * 30 + examPaperMark * 70) / 100.0;
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

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t" + finalMark + "\t\t" + grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + " : ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + " : ");
            int assignment = input.nextInt();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + " : ");
            int exam = input.nextInt();
            input.nextLine();  

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println();
        System.out.println("Name\tFinal Mark\tGrade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}