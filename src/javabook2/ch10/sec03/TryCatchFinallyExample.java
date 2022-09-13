package javabook2.ch10.sec03;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		// 기능 : 클래스 로드
		// 입력값 : 클래스 이름
		try {
			Class clazz = Class.forName("java.lang.String2"); // 일반 예외( 컴파일 안됨)
		}catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다.");
		}
		
	}

}
