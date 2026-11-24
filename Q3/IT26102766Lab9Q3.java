public class IT26102766Lab9Q3{
	public static int add(int n1, int n2){
		return n1 + n2;
	}
	public static int multiply(int n3, int n4){
		return n3 * n4;
	}
	public static int square(int n5){
		return n5 * n5;
	}
	
	public static void main (String[] args){
		
		System.out.println();
		
		int result1 = square(add(multiply(3, 4), multiply(5, 7)));
		int result2 = add(square(add(4,7)), square(add(8,3)));
		
		System.out.println("Result of (3 * 4 + 5 * 7)\u00B2    : " + result1);
		System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2 : " + result2);
	}
}