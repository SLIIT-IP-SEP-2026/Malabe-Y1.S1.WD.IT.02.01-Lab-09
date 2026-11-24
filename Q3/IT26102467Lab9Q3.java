public class IT26102467Lab9Q3{
	
	public static int add(int num1,int num2){
		int result = num1 + num2;
		return result;
		
	}
	
	public static int multiply(int x,int y){
		int result2 = x*y;
		return result2;
		
	}
	
	public static int square(int i){
		int result3 = i*i;
		return result3;
		
	}
	
	public static void main(String[] args){
		int a,b,c,d,e = 0;
		a = multiply(3,4);
		b = multiply(5,7);
		c = add(a,b);
		d = square(c);
		
		System.out.println("Result of (3 ∗ 4 + 5 ∗ 7)^2 : " + d);
		
		a = add(4,7);
		b = add(8,3);
		c = square(a);
		d = square(b);
		e = add(c,d);
		
		System.out.println("Result of (4 + 7)2 + (8 + 3)2 : " + e);
		
	}
}