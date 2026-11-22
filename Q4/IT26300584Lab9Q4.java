// Q4

import java.util.Scanner;

public class IT26300584Lab9Q4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int stu = 0;
		String stuName;
		int assignmentMark, paperMark;
		
		while(stu < 5)
		{
			System.out.println(" ");
			System.out.print("Enter Name of Student " + (stu + 1) + " : " );
			stuName = sc.nextLine();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + stuName + " : ");
			assignmentMark = sc.nextInt();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + stuName + " : ");
			paperMark = sc.nextInt();
			
			int finalMark = calcFinalMark(assignmentMark, paperMark);
			char grade = findGrades(finalMark);
			printDetails(stuName,finalMark,grade);
			
			stu++;
			
			sc.nextLine();
		}
		
	}
	
	public static int calcFinalMark(int assignmentMark, int paperMark)
	{
		int finalMark = (int)(assignmentMark * 0.30 + paperMark * 0.70);
		return finalMark;
	}
	
	public static char findGrades(int finalMark)
	{
		char grade;
		if (finalMark >= 75)
		{
			grade = 'A';
		}
		else if(finalMark >= 60)
		{
			grade = 'B';
		}
		else if(finalMark >= 50)
		{
			grade = 'C';
		}
		else
		{
			grade = 'F';
		}
		
		return grade;
	}
	
	public static void printDetails(String stuName, int finalMark, char grade)
	{
		System.out.println("\nName" + "     " + "Final Mark" + "     " + "Grade");
		System.out.println(stuName + "     " + finalMark + "     " + grade);
			
	}
}
			
			
			
		