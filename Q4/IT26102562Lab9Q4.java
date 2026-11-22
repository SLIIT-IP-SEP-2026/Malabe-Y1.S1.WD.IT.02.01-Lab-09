import java.util.Scanner;

public class IT26102562Lab9Q4
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name[] = new String[5];
		double finalMarks[] = new double[5];
		char finalGrades[] = new char[5];
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print("Enter Name of Student "+ (i+1) +" : ");
			name[i] = input.next();
			System.out.print("Enter Assignment Marks of Student " + name[i] +" : ");
			int assigMark = input.nextInt();
			System.out.print("Enter Exam Marks of Student "+ name[i] +" : ");
			int examMark = input.nextInt();
			System.out.println();
			
			finalMarks[i] = calcFinalMark(assigMark,examMark);
			finalGrades[i] = findGrades(finalMarks[i]);
		}
		
		System.out.printf("%-15s %-15s %-10s%n", "Name", "Final Mark", "Grade");
		
		for(int i=0 ; i<5 ; i++)
		{
			printDetails(name[i],finalMarks[i],finalGrades[i]);
		}
	}
	
	public static double calcFinalMark(int assigMark, int examMark)
	{
		return (assigMark*0.3)+(examMark*0.7);
	}
	
	public static char findGrades(double mark)
	{
		if (mark>=75)
		{
			return 'A';
		}
		else if (mark>=60)
		{
			return 'B';
		}
		else if (mark>=50)
		{
			return 'C';
		}
		else
		{
			return 'F';
		}
	}
	
	public static void printDetails(String name, double mark, char grade)
	{
		System.out.printf("%-15s %-15.2f %-10c%n", name, mark, grade);
	}
}