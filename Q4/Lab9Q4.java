import java.util.Scanner;

public class Lab9Q4 {

    public static double calcFinalMark(int assignmentMark, int examPaperMark) {
       double  calcFinalMark =  assignmentMark * 0.3 + examPaperMark * 0.7;
       return calcFinalMark;
    }

    public static char findGrade(double finalMark) {
        char grade;
        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 65) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }

    // void method because we are not returning any value
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%s \t\t%.2f \t\t%c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = input.next();

        System.out.println("Enter exam marks:");
        int examPaperMark = input.nextInt();

        System.out.println("Enter Assignment marks:");
        int assignmentMark = input.nextInt();

        double finalMark = calcFinalMark(assignmentMark, examPaperMark);
        char grade = findGrade(finalMark);
        printDetails(name, finalMark, grade);
    }
}