import java.util.Scanner;
public class IT26510428Lab9Q1{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter value a: ");
		a=input.nextInt();
		System.out.print("Enter value b: ");
		b=input.nextInt();
		System.out.print("Enter value c: ");
		c=input.nextInt();
		
		double bpower=Math.pow(b,2);//power of b
		double number=(bpower-4*a*c);
		double d=Math.sqrt(number); //square root of b^2-4ac
		
		double Root1=(-b+d)/(2*a);
		double Root2=(-b-d)/(2*a);
		System.out.println("\nRoots are real and different : ");
		System.out.print("Root 1: "+Root1);
		System.out.println();
		System.out.print("Root 2: "+Root2);
	}
}
		