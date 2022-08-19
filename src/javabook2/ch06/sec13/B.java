package javabook2.ch06.sec13;

public class B {
	// 필드==============
	A a1 = new A(true);
	A a2 = new A(10);
//	A a3 = new A("java");	
	
	// 생성자==============
	
	// 메소드==============
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 2;
		//같은 패키지 내에선 디폴트 접근가능
//		a.field3 = 3;	
		//private 은 무조건 접근 불가
		a.method1();
		a.method2();
		//같은 패키지 내에선 디폴트 접근가능
//		a.method3();
		//private 은 무조건 접근 불가
	}
	
	
}
