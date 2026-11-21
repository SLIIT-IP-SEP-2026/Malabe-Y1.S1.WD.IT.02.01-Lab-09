import java.util.Scanner;
public class IT26100946Lab9Q1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value a :");
		int a= sc.nextInt();
		System.out.print("Enter value b :");
		int b= sc.nextInt();
		System.out.print("Enter value c :");
		int c= sc.nextInt();
		
		double coefficient = Math.pow(b, 2) - 4 * a * c;
		if (coefficient > 0) {
            double root1 = (-b + Math.sqrt(coefficient)) / (2 * a);
            double root2 = (-b - Math.sqrt(coefficient)) / (2 * a);

            System.out.println("Roots are real and different :");
            System.out.println("Root 1: "+ root1);
		    System.out.println("Root 2: " +root2);
		}
		else if (coefficient == 0){
			double root = -b / (2 * a);

            System.out.println("Roots are real and equal :");
            System.out.print("Root 1: " +root);
            System.out.print("Root 2: "+ root);
			
		}
		else{
			System.out.println("Roots are complex and different :");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-coefficient) / (2 * a);
            System.out.printf("Root 1:"+ realPart+imaginaryPart);
            System.out.printf("Root 2: "+ realPart+ imaginaryPart);
		}
		sc.close();
	}
	
}