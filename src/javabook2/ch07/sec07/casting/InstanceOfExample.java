package javabook2.ch07.sec07.casting;

public class InstanceOfExample {
	
	public static void method1(Parent parent) {
		
		if(parent instanceof Child) {
			// Child 타입의 인스턴스로 parent 객체를 사용할수 있는가?
		
		Child child = (Child)parent;
		System.out.println("method1 -> Child로 변환 성공");
		}else {
			System.out.println("method1 -> Child로 변환 할수 없음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;	// 예외 발생
		System.out.println("method2 -> Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();	// 자동 형변환
		
		
		// 매개변수 : 자식 클래스 객체가 자동 형변환 된 것을 사용
		method1(parentA);	// 변환성공
		method2(parentA);	// 변환 성공

		Parent parentB = new Parent();
		// 매개변수 : 부모 클래스 객체
		method1(parentB);	// 변환 불가능
//		method2(parentB);	// 예외발생
	}

}
