import java.util.Scanner;

public class IT26102739Lab9Q3
{	
	//Method to ADD two numbers
	public static int add(int a,int b)
	{
		int add = a + b;
		return add;
	}
	
	//Method to MULTIPLY two numbers
	public static int multiply(int a,int b)
	{
		int multiply = a * b;
		return multiply;
	}
	
	//Method to SQUARE a number
	public static int square(int c)
	{
		int square = c * c;
		return square;
	}
	
	public static void main(String[]args)
	{
		// Equation 01 _ (3 * 4 + 5 * 7)^2
		
		int x = multiply(3,4); // x = 3 * 4
		int y = multiply(5,7); // y = 5 * 7
		int sum = add(x,y); 
		int result1 = square(sum);
		
		//Equation 02 _ (4 + 7)^2 + (8 + 3)^2
		
		int a = add(4,7); // x = 4 + 7
		int power_a = square(a); // x^2
		int b = add(8,3); // y = 8 + 3
		int power_b = square(b); // y^2
		int result2 = add(power_a,power_b); 
		
		System.out.println(" ");
		System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
	}
}
		