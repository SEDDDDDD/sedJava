package javabook2.ch06;

public class Calculator {
	// 필드

	// 생성자
	
	// 메서드
	// 1. 전원 켜기
	void powerOn() {
		System.out.println("Power ON");
	}
	// 2. 더하기
//	int plus(int x, int y) {
//		int result = x + y;
//		
//		return result;
//	}
	static int plus(int x, int y) {
		return x+y;
	}
	
	
//	double plus(double x, double y) {
//		double result = x + y;
//		
//		return result;
//	}
	// 3. 나누기
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		
		return result;
	}
	// 4. 전원 끄기
	void powerOff() {
		System.out.println("Power OFF");
	}
	
	// 5. 더하기 + 나누기
	double plus_divide(int x, int y) {
		double result;
		int sum = plus(x, y);	// 더하기 : x + y
		result = divide(sum, y);		// 나누기 : (x + y) / y
		return result;
	}
	static double pi = 3.14159;
	

	static int minus(int x, int y) {
		return x-y;
	}
}
