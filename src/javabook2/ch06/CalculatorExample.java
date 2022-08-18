package javabook2.ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();	// 내계산기
		
		// 메서드 호출
		myCalc.powerOn();
		
		int sum = myCalc.plus(20, 10);
		
//		double sum_double = myCalc.plus(20.1, 10.2);
		int sum_int = Calculator.plus(20, 30);
		
		int minus_int = Calculator.minus(50, 30);
		
		double divide = myCalc.divide(50, 7);
		
		double sum2 = myCalc.plus_divide(20, 10);
		
		System.out.println("plus result : "+sum);
		
		System.out.println("divide result : "+divide);
		
		System.out.println("plus divide result = "+sum2);
		
//		System.out.println(sum_double);
		
		System.out.println(sum_int);
		System.out.println(minus_int);
		
		myCalc.powerOff();
		
	}

}
