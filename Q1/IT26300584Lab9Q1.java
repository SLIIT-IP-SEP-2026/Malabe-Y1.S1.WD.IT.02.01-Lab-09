// Q1

import java.util.Scanner;

public class IT26300584Lab9Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double root1, root2;
		double a, b, c;
		
		System.out.print("Enter the value a: ");
		a = input.nextDouble();
		
		System.out.print("Enter the value b: ");
		b = input.nextDouble();
		
		System.out.print("Enter the value c: ");
		c = input.nextDouble();
		
		double beforeRoot = Math.pow(b, 2) - 4*a*c;
		
		if (beforeRoot > 0)
		{
			root1 = (-b + Math.sqrt(beforeRoot))/(2*a);
		}
		else
		{
			root2 = (-b - Math.sqrt(beforeRoot))/(2*a);
		}
		
		System.out.println("\nRoots are real and different : ");
		System.out.println("Root 1 : " + root1);
		System.out.println("Root 2 : " + root2);
	}
}
		
		