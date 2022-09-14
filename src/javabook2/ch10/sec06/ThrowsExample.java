package javabook2.ch10.sec06;

public class ThrowsExample {
	public static void findClass() throws ClassNotFoundException {
//		try{
		Class clazz = Class.forName("java.lang.String");
		throw new ClassNotFoundException("클래스 확인 불가");	// 예외 발생 코드
//		}catch(ClassNotFoundException e) {
//			
//		}
	}

	public static void main(String[] args) {
		System.out.println("메인 함수 실행");
		try {
			findClass();
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
		}
		System.out.println("메인 함수 종료");
	}

}
