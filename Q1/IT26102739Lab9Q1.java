import java.util.Scanner;

public class IT26102739Lab9Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		
		System.out.print("Enter value a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter value b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter value c: ");
		double c = input.nextDouble();
		
		double power_of_b = Math.pow(b,2); // (b^2)
		double expression = (power_of_b - 4*a*c); // (b^2 - 4*a*c)
		double squareRoot = Math.sqrt(expression); 
		
		double root1 = (-b + expression)/(2*a); // (-b + (b^2 - 4*a*c)) / 2*a
		double root2 = (-b - expression)/(2*a); // (-b - (b^2 - 4*a*c)) / 2*a
		
		System.out.println(" ");
		System.out.println("Roots are real and different : ");
		System.out.println("Root 1: " + root1);// x = (-b + (b^2 - 4*a*c)) / 2*a
		System.out.println("Root 2: " + root2);// x = (-b - (b^2 - 4*a*c)) / 2*a
	}
}
	