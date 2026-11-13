public class IT26510428Lab9Q3{
	public static int add(int a,int b){
		return a+b;
	}
	public static int multiply(int a,int b){
		return a*b;
	}
	public static int square(int n){
		return n*n;
	}
	public static void main(String[]args){
	
		//Q1
		int X= multiply(3,4);
		int Y= multiply(5,7);
		int sum=add(X,Y);
		int Result1=square(sum);
		
		//Q2
		int P=add(4,7);
		int Q=add(8,3);
		int power1=square(P);
		int power2=square(Q);
		int Result2=add(power1,power2);
		
		//Printing results
		System.out.print("Result of (3 * 4 + 5 * 7)^2      :"+Result1);
		System.out.print("\nResult of (4 + 7)^2 + (8 + 3)^2  :"+Result2);
		
	}
		
}
