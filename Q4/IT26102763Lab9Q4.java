import java.util.Scanner;

public class IT26102763Lab9Q4 {

    
    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
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

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Student Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = input.nextDouble();

            input.nextLine();

            
            finalMarks[i] = calcFinalMark(assignment, exam);

            
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        
        System.out.println("Name           Final Mark     Grade");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 5; i++) {

            printDetails(names[i], finalMarks[i], grades[i]);
        }

        
    }
}