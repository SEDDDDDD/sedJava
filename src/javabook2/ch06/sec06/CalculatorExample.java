package javabook2.ch06.sec06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		
		int result3 = Calculator.minus(20, 10);
		
		double result4 = Calculator.divide(result2, result3);
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		javabook2.ch06.sec06.Calculator cal1 = new Calculator();
	}

}
