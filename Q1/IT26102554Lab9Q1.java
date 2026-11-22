import java.util.Scanner;

public class IT26102554Lab9Q1{
 public static void main(String[]args){
 
 Scanner input = new Scanner(System.in);
  
  System.out.print("Enter value a :");
  int a = input.nextInt();
  System.out.print("Enter value b :");
  int b = input.nextInt();
  System.out.print("Enter value c :");
  int c = input.nextInt();
  
  
  double x = Math.pow(b,2 )-4*a*c;
  
  if (x>0){
	  double root1 = (-b + Math.sqrt(x)) / (2*a);
	  double root2 = (-b - Math.sqrt(x)) / (2*a);
	  
  System.out.println("Roots are real and different : " );
  System.out.println("Root 1 : " + root1 );
  System.out.println("Root 2 : " + root2 );
  }
  
  else if (x==0){
	  double root = -b/(2.0*a);
  System.out.println("Roots are real and different : " );
  System.out.println("Root 1 : " + root );
  System.out.println("Root 2 : " + root );
  }
  else {
            System.out.println("Roots are not real");
        }
 }
}