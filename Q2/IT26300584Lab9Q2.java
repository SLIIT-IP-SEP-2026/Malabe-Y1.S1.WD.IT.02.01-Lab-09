// Q2

import java.util.Scanner;

public class IT26300584Lab9Q2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		
		double area = circleArea(radius);
		System.out.print("The Area of the circle with radius of " + radius + " is : " + area);
	}
	
	public static double circleArea(double radius)
	{
		double pi = 3.14;
		
		double a = pi * radius * radius;
		return a;
	}
}
		
		
		