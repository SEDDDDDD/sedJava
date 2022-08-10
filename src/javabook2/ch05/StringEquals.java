package javabook2.ch05;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
		
		if (strVal1 == strVal2) {
			System.out.println("strVal1 과 strVal2는 참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("문자열이 같다");
		}
		
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");
		
		if (strVal3 == strVal4) {
			System.out.println("참조가 같다");
		} else {
			System.out.println("참조가 다름");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("값이 같다");
		} else { 
			System.out.println("값이 다르다");
		}
	}

}
