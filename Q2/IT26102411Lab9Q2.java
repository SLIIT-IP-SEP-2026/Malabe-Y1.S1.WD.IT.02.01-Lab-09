import java.util.Scanner;
public class IT26102411Lab9Q2{
	public static double getradius(double radius){
		double area = Math.PI * (Math.pow(radius,2));
		return area;
	}
	
	public static void main(String[] args){
		
		double radius = 0.0;
		double result = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		radius = input.nextDouble();
		
		result = getradius(radius);
		System.out.println("Area of circle with Radius " + radius + " is : " + result);
		
		
		
	}
}