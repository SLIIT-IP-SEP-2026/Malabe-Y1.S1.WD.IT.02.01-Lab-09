import java.util.Scanner;
public class IT26102573Lab9Q2{

	public static final float pi = 3.14159f ;
	public static float circleArea(float r){
		return pi * r * r ;		
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		float rad = input.nextFloat();
		System.out.print("\n");
		float area = circleArea(rad) ;
		System.out.print("The area of the circle with radius " + rad + " is : " + area );
	}
}	