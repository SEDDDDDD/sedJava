package javabook2.ch02;

public class VariableExample {

	public static void main(String[] args) {
System.out.println("hello World");
		

		int score;
		score = 90;
		
		System.out.println(score);
		
		int number = 50;
		
		System.out.println(number);
		
		System.out.println(score+number);
		
		System.out.println(score-number);
		
		System.out.println(number-score);
		
		boolean val1;
		val1 = true;
		
		System.out.println(val1);
		
		val1 = false;
		System.out.println(val1);
		
		
//		정수 리터럴을 저장할 수 있는 데이터 타입(5가지)
		byte b = 1;
		char c = 2;
		short s = 3;
		int i = 4;
		long l = 5;
		
		
//		실수 리터럴
		
		float f = 0.1f;
		
		double d = 0.5;
		
//		문자 리터럴
		char ch1 = 'A';
		char ch2 = '가';
		char ch3 = '3';
		
		
//		문자열 리터럴
		String str1 = "ABC";
		String str2 = "가나다라";
		
//		System.out.println(str2);
		
		
//		논리 리터럴
		boolean bool1 = true;
		boolean bool2 = false;
		
		
		
		
		int value = 10;
		System.out.println("value="+value);
		value = 20;
		System.out.println("value="+value);
		System.out.println("value="+value*2);
		
		
		int result = value + 5;
		System.out.println("value="+value);
		System.out.println("result="+result);
	}	

}