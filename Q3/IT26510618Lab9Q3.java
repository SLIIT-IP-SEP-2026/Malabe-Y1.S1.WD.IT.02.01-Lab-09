import java.util.Scanner;
public class IT26510618Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to find the square
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)²
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression 2: (4 + 7)² + (8 + 3)²
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)² : " + result1);

        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
    }
}