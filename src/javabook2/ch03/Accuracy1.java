package javabook2.ch03;

public class Accuracy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		
		int totalPiece = apple * 10;
		
		
		int number = 7;
		
		System.out.println("사과한개에서 0.7 조각을 빼면");
		float result2 = apple - (float)pieceUnit * number;
//		double result = apple - pieceUnit * number;
		int temp = totalPiece - number;
		double result = temp / 10.0;
		
		System.out.println(result);
		System.out.println(result2);
	
		
		// 나눗셈, 나머지(%) 연산 수행시 주의
//		1. 0 으로 나누는 경우 : 5/ 0.0 -> Infinity(무한대)
//		2. 0 으로 나머지 연산하는 경우 : 5 % 0.0 -> NaN(Not a Number)
		
	
	}

}
