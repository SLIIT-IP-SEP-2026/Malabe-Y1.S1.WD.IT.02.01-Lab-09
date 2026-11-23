import java.util.Scanner;

public class Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, root1, root2, discriminant;

        System.out.print("Enter value a: ");
        a = input.nextDouble();

        System.out.print("Enter value b: ");
        b = input.nextDouble();

        System.out.print("Enter value c: ");
        c = input.nextDouble();

        discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and different:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } 
        else if (discriminant == 0) {
            root1 = -b / (2 * a);

            System.out.println("Roots are real and equal:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root1);
        } 
        else {
            System.out.println("Roots are imaginary");
        }

        
    }
}