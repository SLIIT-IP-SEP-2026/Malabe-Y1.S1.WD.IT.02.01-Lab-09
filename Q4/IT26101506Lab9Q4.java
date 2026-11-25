import java.util.Scanner;

  public class IT26101506Lab9Q4{
	  
	static String[] studentA = new String[5];
	static double[] finalMarks= new double [5];
	static char[] grade = new char[5];
   	    
  public static double calcFinalMark(double assignmentMark,double examMark){
      return (assignmentMark * 0.3) + (examMark * 0.7);
    }
 
 public static char findGrades(double mark){
        if ( mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails() {
        System.out.printf("%-15s %-15s %-10s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s %-15.2f %-10c%n",
                    studentA[i], finalMarks[i], grade[i]);
        }
    }

	
	
  public static void main(String [] args){

    
	Scanner input = new Scanner(System.in);
	

	
	for (int i = 0 ; i < 5 ; i++){
	
	   System.out.print("Enter Name of Student "+(i+1)+": ");
	   studentA[i]=input.nextLine();
	   
	   
	   System.out.print("Enter Assignement Mark (out of 100) for "+studentA[i]+": ");
	   double assignmentM = input.nextDouble();
 
       System.out.print("Enter Exam Paper Mark (out of 100) for "+studentA[i]+": ");
	   double examM = input.nextDouble();
		
       finalMarks[i] = calcFinalMark(assignmentM, examM);
       grade[i] = findGrades(finalMarks[i]);
	   
	   input.nextLine();
	   System.out.println();
		
	   }	
		printDetails();
        input.close();
    }  
}

