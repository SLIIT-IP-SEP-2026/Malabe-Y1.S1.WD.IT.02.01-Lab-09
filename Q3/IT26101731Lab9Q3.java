public class IT26101731Lab9Q3{
    public static void main(String[] args){
	
	    int result1=square(add(multiply(3,4),multiply(5,7)));
	    System.out.println("Result of (3*4+5*7)²    : "+result1);
		int result2=add(square(add(4,7)),square(add(8,3)));
		System.out.println("Result of (4+7)²+(8+3)² : "+result2);
	}
	public static int add(int number1,int number2){
	    return number1+number2;
		}
	public static int multiply(int number1,int number2){
	    return number1*number2;
		}
	public static int square(int number1){
	    return number1*number1;
		}
}