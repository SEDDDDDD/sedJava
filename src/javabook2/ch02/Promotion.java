package javabook2.ch02;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 형변환
		byte byteVal = 3;
		int intVal = byteVal;	// byte(2) -> int(4)
		
		char charVal = '가';
		intVal = charVal;		// int(4) -> char(2)
		
		System.out.println(charVal);
		System.out.println(intVal);
		
		// int(4) -> long(8)
		
		long longVal = intVal;
		
		
		// double(8) <- int(4)
		intVal = 200;
		double doubleVal = intVal;
		
		// 자동 타입 변환 순서
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		
		// long은 정수형 이므로 단순히 바이트 크기가 크다고 실수형으로 변환하면 소수점 버려짐
		// 그렇게 되면 손실이 더 크게 일어날 수 있으므로 바이트 크기에 상관없이 실수형이 무조건
		// 우선순위가 높음
		
		
		// float(4) <- long(8)
		longVal = 2147483648L;
		System.out.println(longVal);
		float floatVal = longVal;
		System.out.println(floatVal);
		
		floatVal = 123456789.90123456f;
		System.out.println(floatVal);
		longVal = (long)floatVal;
		System.out.println(longVal);
		
	}

}
