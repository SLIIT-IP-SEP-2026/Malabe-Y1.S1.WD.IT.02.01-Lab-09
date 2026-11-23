import java.util.Scanner;

public class IT26101289Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } 
        else if (mark >= 60) {
            return 'B';
        } 
        else if (mark >= 50) {
            return 'C';
        } 
        else {
            return 'F';
        }
    }

    public static void printDetails(String name, double mark, char grade) {
        System.out.printf("%-10s %-12.2f %-5c%n", name, mark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignment = new double[5];
        double[] exam = new double[5];
        double[] finalMark = new double[5];
        char[] grade = new char[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            assignment[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            exam[i] = input.nextDouble();

            finalMark[i] = calcFinalMark(assignment[i], exam[i]);
            grade[i] = findGrades(finalMark[i]);

            System.out.println();
        }

        System.out.printf("%-10s %-12s %-5s%n",
                "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMark[i], grade[i]);
        }

        
    }
}