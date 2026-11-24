import java.util.Scanner;
public class IT26102467Lab9Q4{
	public static double calcFinalMark(double assig_mark , double exam_mark){
		double mark1 = (assig_mark*30)/100;
		double mark2 = (exam_mark*70)/100;
		double final_mark = mark1 + mark2;
		return final_mark;
	}
	
	public static String findGrades(double finalmark){
		
		String grade = "A";
		
		if (finalmark >= 60 && finalmark < 75){
			grade = "B";
		}
		else if (finalmark >= 50 && finalmark < 60){
			grade = "C";
		}
		
		else if (finalmark < 50 ){
			grade = "F";
		}
		
		return grade ;
		
	}	
	
	public static void printDetails(String name, double marks , String grade){
		System.out.printf("%-15s %-15.2f %-10s%n",name,marks,grade);
		
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String [] name = new String[5];
		double [] finalmark = new double [5];
		String [] grade = new String[5];
		double assmark,exammark = 0.0;
		
		for (int i = 0 ; i < 5 ; i++){
			
			System.out.println("Enter Name :");
			name[i] = input.next();
			
			System.out.println("Enter Assignment mark (out of 100) for " + name + " :");
			assmark = input.nextDouble();
			
			System.out.println("Enter exam mark (out of 100) for " + name + " :");
			exammark = input.nextDouble();
			
			finalmark[i] = calcFinalMark(assmark,exammark);
			grade[i] = findGrades(finalmark[i]);
				
		}
		
		System.out.println();
		System.out.printf("%-15s %-15s %-10s%n",
                          "Name", "Final Mark", "Grade");
		
		for (int j = 0 ; j < 5 ; j++){
			
			printDetails(name[j],finalmark[j],grade[j]);
			
		}
	}
}