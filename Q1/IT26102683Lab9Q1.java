import java.util.Scanner;
public class IT26102683Lab9Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value a : ");
		double a = input.nextDouble();
		
		System.out.print("Enter value b : ");
	    double b = input.nextDouble();
		
		System.out.print("Enter value c : ");
		double c = input.nextDouble();
		System.out.print("\n");
		
		double d = Math.pow( b , 2) - (4*a*c);
		
		double e = Math.sqrt(d);
		
		if(a==0){
			System.out.println("Not a quadratic equation");
		}
		else if(d==0){
			double x = ((-b)/(2*a));
		}
		else if(d>0){
			double x1 = (-b + e)/(2*a) ;
			double x2 = (-b - e)/(2*a) ;
			System.out.println("Roots are real and different : ");
			System.out.println("Root 1 : " + x1 );
			System.out.println("Root 2 : " + x2 );
		}
		else{
			System.out.println("Roots are not real");
		}
	}    
}