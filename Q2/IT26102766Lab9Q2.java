import java.util.Scanner;
public class IT26102766Lab9Q2{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Enter the radius of the circle: ");
	    double radius = input.nextDouble();
		
		System.out.print("The area of the circle with radius " + radius + " is : " + circleArea(radius));
		
		System.out.println();
	}
	
	public static double circleArea(double r){
		return Math.PI * Math.pow(r, 2);		
	}
	
}