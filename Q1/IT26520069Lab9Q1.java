import java.util.Scanner;

public class IT26520069Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        int a = input.nextInt();

        System.out.print("Enter value b: ");
        int b = input.nextInt();

        System.out.print("Enter value c: ");
        int c = input.nextInt();

        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
        } else {
            double discriminant = Math.pow(b, 2) - 4.0 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("Roots are real and different :");
                System.out.println("Root 1 : " + root1);
                System.out.println("Root 2 : " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2.0 * a);
                System.out.println("Roots are real and equal :");
                System.out.println("Root : " + root);
            } else {
                System.out.println("Roots are complex (not real).");
            }
        }

        
    }
}