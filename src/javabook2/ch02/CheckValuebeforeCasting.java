package javabook2.ch02;

public class CheckValuebeforeCasting {

	public static void main(String[] args) {
		
		int i =127;
		
		System.out.println(i);
		
		
//		-128 <= int <= 127
		// 만약 int 값이byte 범위를 벗어난다면 ㅁ
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			// 안내문구를 출력하자
			System.out.println("byte 타입으로 변환 불가");
			System.out.println("값을 다시 확인해 주세요");
		} else { byte b = (byte)i;
		
		System.out.println(b);
		}
		


		
		
	}

}
