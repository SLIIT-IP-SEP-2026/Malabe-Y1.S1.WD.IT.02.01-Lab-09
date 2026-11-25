import java.util.Scanner;
public class Lab9Q3{
 public static void main(String[] args){
	 
	 int result1 = square(addition(multiplication(3,4),multiplication(5,7)));
	 System.out.print("Result of (3 ∗ 4 + 5 ∗ 7)^2 " + result1);

	 int result2 = addition(square(addition(4,7)),square(addition(8,3)));
	 System.out.print("Result of (4 + 7)^2 + (8 + 3)^2 " + result2);

 }
 public static int addition(int num1,int num2){
	 int add = num1 + num2; 
	 return add;
 }
	 
public static int multiplication(int num1,int num2){
	int multiply = num1*num2;
	return multiply;
}

public static int square(int num1,int num2){
	int square = num1*num1;
	return square;
}
}