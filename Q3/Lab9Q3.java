public class Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        int num1, num2;
        num1 = square(add(multiply(3, 4), multiply(5, 7)));
        num2 = square(add(multiply(4, 7), multiply(8, 3)));

        System.out.println("Result of (3*4 + 5*7)^2 : " + num1);
        System.out.println("Result of (4*7 + 8*3)^2 : " + num2);
    }
}
