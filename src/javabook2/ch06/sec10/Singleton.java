package javabook2.ch06.sec10;

public class Singleton {
	static Singleton single = new Singleton();
	
	// 1. 외부에서 new 연산자로 생성자를 호출할 수 없도록 막기
	
	// 2. 클래스 자신의 타입으로 정적필드 선언
	
	// 3. 외부에서 호출 할수 있는 정적 메소드인 getInstance()를 선언

	//필드
	int field = 1;
	//생성자
	
	//메소드
	void method() {
	}	
	static Singleton getInstance() {
		return single;
	}
}
