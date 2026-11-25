import java.util.Scanner;
public class Lab9Q4{
    public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	String name=" ";
	int assignment,exam;
	int student=1;
	String names[]=new String[5];
	double finalMark[]=new double[5];
    char grade[]=new char[5];
	
	System.out.println();
	while(student<=5){
	    System.out.print("Enter name of student "+student+": ");
		name=input.next();
		names[student-1]=name;
		
		System.out.print("Enter assignment mark (out of 100) for "+name+": ");
		assignment=input.nextInt();
		System.out.print("Enter exam paper mark (out of 100) for "+name+": ");
		exam=input.nextInt();
		System.out.println();
		double Final=calcFinalMark(assignment,exam);
	    finalMark[student-1]=Final;
		
		char finalGrade=findGrades(Final);
		grade[student-1]=finalGrade;
	    
		student++;
		}
    printDetails(names,finalMark,grade);
	}
	public static double calcFinalMark(int assignment,int exam){
	    return (assignment*0.3)+(exam*0.7);
		}
	public static char findGrades(double finalMark){
	    char grade;
	    if(finalMark>=75){
		    grade='A';
		    }
		else if(finalMark>=60){
		    grade='B';
			}
		else if(finalMark>=50){
		    grade='C';
			}
		else{
		    grade='F';
		    }
		return grade;
		}
	public static void printDetails(String names[],double finalMark[],char grade[]){
	    int i=0;
		System.out.println("Name\t\tFinal Mark\tGrade");
		for(i=0;i<5;i++){   
		    System.out.println(names[i]+"\t\t"+finalMark[i]+"\t\t"+grade[i]);
		}
	}
}