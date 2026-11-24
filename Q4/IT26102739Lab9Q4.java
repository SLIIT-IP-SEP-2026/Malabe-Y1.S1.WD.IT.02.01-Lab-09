import java.util.Scanner;

public class IT26102739Lab9Q4
{
	public static void main(String[]arrgs)
	{
		
		Scanner input = new Scanner(System.in);
	
		String[] names = new String[5]; //Create 1D String Array
	
		//Create 1D Double Arrays
		double assignmentMarks[] = new double[5];
		double examMarks[] = new double[5];
		double finalMark[] = new double[5];
	
		char[] grades = new char[5]; //Create 1D Char Arrays
	
		for(int i = 0; i < 5; i++){
		
			System.out.println();
			System.out.print("Enter Name of Student " + (i + 1) + ": ");
			names[i] = input.nextLine(); // Stores the name in the array for names
			
			System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
			assignmentMarks[i] = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
			examMarks[i] = input.nextDouble();
			
			//Calculating the final mark & grades
			finalMark[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
			grades[i] = findGrades(finalMark[i]);
			
			input.nextLine(); //To prevent the skipping of the next input
		}
		System.out.println();
	
		System.out.println("Name\t\tFinal Mark\tGrade"); // To print the Headings
	
		// To print the details of each student
		for(int i = 0; i < 5; i++){
			
			printDetails(names[i], finalMark[i], grades[i]); // Print_Details Method
		}
	}
	
	//Method to Calculate the final mark
	public static double calcFinalMark(double assignmentMarks, double examMarks)
	{
		double finalMark = (examMarks * 0.70) + (assignmentMarks * 0.30); // 30% of the Assignment, 70% of the Exam Paper
		return finalMark;
	}
	
	//Method to Calculate the final grade 
	public static char findGrades(double finalMark)
	{
		char grades;
		if(finalMark >= 75){
			grades = 'Á';
		}
		else if(finalMark >= 60){
			grades = 'B';
		}
		else if(finalMark >= 50){
			grades = 'C';
		}
		else{
			grades = 'F';
		}
		return grades;
	}

	public static void printDetails(String name, double finalMark,char grades)
	{
		System.out.println(name + "\t\t" + String.format("%.2f", finalMark) + "\t\t" + grades);
	}
}
