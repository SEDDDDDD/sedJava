package javabook2.ch07.sec06;

// 동일한 패키지 내에서
public class B {
	public void method() {
		A a = new A();	//생성자 호출가능
		a.field = "A's Field";	// 필드 사용 가능
		a.method();		// 메서드 호출 가능
	}
}
