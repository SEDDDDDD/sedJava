package javabook2.ch03;

public class BitReverseOperator {

	public static void main(String[] args) {
		
		// 비트 반전 연산자 (~) 1 => 0 => 1
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
//		toBinaryString()
		
		
		System.out.println("이진수");
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		System.out.println(Integer.toBinaryString(v3));

		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println("이진수");
		System.out.println(Integer.toBinaryString(v4));
		System.out.println(Integer.toBinaryString(v5));
		System.out.println(Integer.toBinaryString(v6));
		
	}
		// 함수 
		// 리턴타입 함수명(매개변수) {
//			동작 코드
//			return 리턴값;
//		}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}
	
}
