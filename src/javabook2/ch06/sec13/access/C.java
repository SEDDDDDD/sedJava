package javabook2.ch06.sec13.access;

import javabook2.ch06.sec13.A;

public class C {
	// 필드==============
	A a1 = new A(true);
//	A a2 = new A(10);
//	A a3 = new A("java");
	// 생성자==============
	
	// 메소드==============
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 2;

//		a.field3 = 3;	
		// private 은 무조건 접근 불가
		a.method1();
//		a.method2();
		// 다른 패키지에서는 디폴트접근 불가
//		a.method3();
		// private 은 무조건 접근 불가
	}
}
