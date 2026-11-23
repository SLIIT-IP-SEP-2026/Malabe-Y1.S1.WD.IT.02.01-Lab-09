import java.util.Scanner;
public class IT26101731Lab9Q1{
    public static void main(String[] args){
	
	int a,b,c;
	double x,root1,root2;
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter value a: ");
	a=input.nextInt();
	System.out.print("Enter value b: ");
	b=input.nextInt();
	System.out.print("Enter value c: ");
	c=input.nextInt();
	System.out.println();
	
	System.out.println("Roots are real and different:");
	root1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	System.out.println("Root 1: "+root1);
	root2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	System.out.println("Root 2: "+root2);
	}
}