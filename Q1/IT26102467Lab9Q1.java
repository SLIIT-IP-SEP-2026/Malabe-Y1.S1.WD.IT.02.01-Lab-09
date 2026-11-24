import java.util.Scanner;
public class IT26102467Lab9Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double a,b,c,d,x1,x2 = 0.0;
		
		System.out.println("Enter value a :");
		a = input.nextDouble();
		
		System.out.println("Enter value b :");
		b = input.nextDouble();
		
		System.out.println("Enter value c :");
		c = input.nextDouble();
		
		if (a == 0){
			System.out.println("Not a Quadratic equation");
			
		}
		else{
			d = Math.pow(b,2) - 4 * a * c;
			
			if(d > 0){
				x1 = (-b + Math.sqrt(d))/(2*a);
				x2 = (-b - Math.sqrt(d))/(2*a);
				
				System.out.println("Root are real and different");
				System.out.println("Root 1 : " + x1);
				System.out.println("Root 2 : " + x2);
			
			
			}
			
			else if (d == 0){
				x1 = (-b / (2*a));
				System.out.println("One Repeated Root :");
				System.out.println("Root : " + x1);
			}
			
			else{
				System.out.println("No Real Roots ");
			}
		}
		
		
	}
}