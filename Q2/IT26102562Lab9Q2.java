import java.util.Scanner;

public class IT26102562Lab9Q2
{
	public static void main(String [] args)
	{
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		int radius = input.nextInt();
		
		double area=circleArea(radius);
		System.out.print("The area of the circle with the radius " + radius + " is : " + area);
		
		
	}
	
	public static double circleArea(double radius)
	{
		double pi = 3.141592;
		double area = pi*radius*radius;
		return area;
	}
}