import java.util.Scanner;
    public class IT26102595Lab9Q4 {
       public static double calcFinalMark(double assignment, double exam) {
         
		 return assignment * 0.30 + exam * 0.70;
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
     System.out.printf("%-15s%-12.2f%-6s%n", name, finalMark, grade);
  }
     
	 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
	 int n = 5;
     String[] names = new String[n];
     double[] finalMarks = new double[n];
     for (int i = 0; i < n; i++) {
    
	System.out.println();
    System.out.print("Enter Name of Student " + (i + 1) + ": ");
    
	names[i] = input.nextLine();
    System.out.print("Enter Assignment Mark (out of 100) for " + names[i]+ ": ");
  
    double assignment = Double.parseDouble(input.nextLine());
    System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i]+ ": ");
    
	double exam = Double.parseDouble(input.nextLine());
    finalMarks[i] = calcFinalMark(assignment, exam);
 }
    System.out.println();
    System.out.printf("%-15s%-12s%-6s%n", "Name", "Final Mark", "Grade");
    
	for (int i = 0; i < n; i++) {
    printDetails(names[i], finalMarks[i], findGrades(finalMarks[i]));
  }
 }
}