package javabook2.ch06.sec06;

public class Calculator {
	static double pi = 3.14159; // static 필드
	
	static int plus(int x, int y) {
		return x + y;
	}
	static double divide(int x, int y) {
		return (double)x / (double)y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
