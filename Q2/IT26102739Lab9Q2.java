import java.util.Scanner;

public class IT26102739Lab9Q2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("Enter the radius of the circle: ");
		
		double radius = input.nextDouble();
		double area = circleArea(radius); // Calls the method and stores the final answer in "area"
		
		System.out.print("The area of the circle with radius " + radius + "is : " + area);
		System.out.println(" ");
	}
	
	public static double circleArea(double radius)
	{
		double area = Math.PI * Math.pow(radius,2);
		return area; 
	}
}
		