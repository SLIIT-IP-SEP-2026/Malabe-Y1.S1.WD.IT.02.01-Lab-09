import java.util.Scanner;
public class Lab9Q2{
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.println("Enter the radius of the circle : ");
	 double radius = input.nextDouble();
	 double area = circleArea(radius);
	 
	 System.out.println("The area of the circle with the radius" + radius + " is " + area);
 }
    public static double circleArea(double radius){
	 final double pi = 22.0/7.0;
	 double area = pi*Math.pow(radius,2); 
	 return area;
    }  
}