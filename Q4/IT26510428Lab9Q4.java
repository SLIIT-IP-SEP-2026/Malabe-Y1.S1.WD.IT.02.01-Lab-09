import java.util.Scanner;
public class IT26510428Lab9Q4{

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String nameArray[]=new String[5];
		double assignmentArray[]=new double[5];
		double paperArray[]=new double[5];
		double finalMark[]=new double[5];
		char grade[]=new char[5];
		for(int i=0;i<nameArray.length;i++){
			System.out.print("Enter Name of Student "+(i+1)+": ");
			String Name=input.nextLine();
			nameArray[i]=Name;
			System.out.print("Enter Assignment Mark (out of 100) for "+(Name)+": ");
			double AssignmentMark=input.nextDouble();
			assignmentArray[i]=AssignmentMark;
			System.out.print("Enter Exam Paper Mark (out of 100) for "+(Name)+": ");
			double PaperMark=input.nextDouble();
			paperArray[i]=PaperMark;
			input.nextLine();
			finalMark[i]=calcFinalMark(AssignmentMark,PaperMark);
			grade[i]=findGrades(finalMark[i]);
		}
		printDetails(nameArray,finalMark,grade);
	}
	public static double calcFinalMark(double AssignmentMark,double PaperMark){
		return (AssignmentMark*0.3)+(PaperMark*0.7);
	}
	public static char findGrades(double finalMark){
		if(finalMark>=75){
			return 'A';
		}
		else if(finalMark>=60){
			return 'B';
		}
		else if(finalMark>=50){
			return 'C';
		}
		else{
			return 'F';
		}
	}
		public static void printDetails(String Name[], double finalMark[], char grade[]){
			System.out.println("Name\t\tFinal Mark\tGrade");
			for(int i=0;i<Name.length;i++){
				System.out.println(Name[i]+"\t\t"+String.format("%.2f",finalMark[i])+"\t\t"+grade[i]);
		}
	}
}
	
		