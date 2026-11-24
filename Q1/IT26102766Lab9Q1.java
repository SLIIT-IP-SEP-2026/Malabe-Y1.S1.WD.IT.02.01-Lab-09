import java.util.Scanner;
public class IT26102766Lab9Q1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value a: ");
		int aValue = input.nextInt();
		
		System.out.print("Enter value b: ");
		int bValue = input.nextInt();
		
		System.out.print("Enter value c: ");
		int cValue = input.nextInt();
		
		double xRoot1 = (-(bValue) + Math.sqrt (Math.pow(bValue,2) - 4 * aValue * cValue)) / (2.0 * aValue);
		double xRoot2 = (-(bValue) - Math.sqrt (Math.pow(bValue,2) - 4 * aValue * cValue)) / (2.0 * aValue);
		
		System.out.println();
		System.out.println("Roots are real and different :");
		System.out.println("Root 1: " + xRoot1);
		System.out.println("Root 2: " + xRoot2);
		
		System.out.println();
	}
}