import java.util.Scanner;
public class IT26102766Lab9Q4{
	
	// 1) method of calculate final mark
	public static double calcFinalMark(double AssignmentMark, double ExamMark){
		return (AssignmentMark * 0.3) + (ExamMark * 0.7);	
	}
	
	// 2) method of find grade
	public static char findGrades(double finalMark){
		if(finalMark >= 75){
			return 'A';
		} else if(finalMark >= 60){
			return 'B';
		} else if(finalMark >= 50){
			return 'C';
		} else{
			return 'F';
		}
	}
	
	// 3) method of detail print
	public static void printDetails(String name, double finalMark, char grade){
		System.out.println(name + "\t\t" + String.format("%.2f", finalMark) + "\t\t" + grade);
	}
	
	// 4) main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
	    // a) get data of 5 students using Array
		String[] names = new String[5];
		double[] finalMark = new double[5];
		char[] grade = new char[5];
		
		//get inputs
		for(int i = 0; i < 5; i++){
			
			System.out.println();
			
			System.out.print("Enter Name of Student " + (i + 1) + ": ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
			double assMark = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
			double examMark = input.nextDouble();
			
			input.nextLine();
			
			System.out.println();
			
			finalMark[i] = calcFinalMark(assMark, examMark);
		    grade[i] = findGrades(finalMark[i]);
		}
		
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		for(int i = 0; i < 5; i++){
		printDetails(names[i], finalMark[i], grade[i]);
		}
	}	
	
}