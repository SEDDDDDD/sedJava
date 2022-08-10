package javabook2.ch02;

public class OperationsPromotion {

	public static void main(String[] args) {
		// 연산식에서 형변환
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		
		// 같은 타입의 피연산자 간에만 연산 가능
		// 만약, 서로다른 타입 피연산자 간에 연산 수행시, 큰 타입으로 자동 변환
		// 정수 연산의 경우, int 타입을 기본으로 한다
		
//		byte byteVal3 = byteVal1 + byteVal2;
		
		int intVal1 = byteVal1 + byteVal2;
		System.out.println(intVal1);
		
		int intVal2 = 30;
		double doubleVal1 = 3.14;
		
		double result = intVal2 + doubleVal1;
		
		System.out.println(result);
		
		int result2 = intVal2 + (int)doubleVal1;
		
		System.out.println(result2);
		
		char charVal1 = 'A';
		char charVal2 = 1;
//		char charVal3 = charVal1 + charVal2;
		int charVal3 = charVal1 + charVal2;
		
		System.out.println(charVal3);
		System.out.println((char)charVal3);
		
		
//		피연산자 중 실수 리터럴이나 double 타입이 있다면
//		다른 피연산자도 double 타입으로 변환하여 연산
		
		int intVal4 = 10;
		int intVal5 = intVal4 / 2 ;
		
		System.out.println(intVal5);
		
		int intVal6 = intVal4 / 4 ;
		
		System.out.println(intVal6);
		
		double result3 = intVal4 / 4.0 ;
		
		System.out.println(result3);
		
		
		
		
		
	}

}
