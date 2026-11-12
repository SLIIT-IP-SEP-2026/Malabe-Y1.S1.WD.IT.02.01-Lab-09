import java.util.Scanner;
public class IT26102740Lab9Q1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double rootPart;
        double root1 , root2;

        System.out.print("Enter value a :");
        a = input.nextDouble();

        System.out.print("Enter value b :");
        b = input.nextDouble();

        System.out.print("Enter value c :");
        c = input.nextDouble();

        System.out.println("");

        rootPart = Math.pow(b,2) - (4*a*c);

        root1 = (-b + Math.sqrt(rootPart) / 2*a);
        root2 = (-b - Math.sqrt(rootPart) / 2*a);

        System.out.println("Roots are real and different :");
        System.out.println("Root 1 : " + root1);
        System.out.println("Root 2 : " + root2);



    }
}