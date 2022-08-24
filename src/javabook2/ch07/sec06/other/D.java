package javabook2.ch07.sec06.other;

import javabook2.ch07.sec06.A;

public class D extends A {
	public D() {
//		A a = new A();	//생성자 호출가능
		super();
//		a.field = "A's Field";	// 필드 사용 가능
		this.field = "A's Field";
//		a.method();		// 메서드 호출 가능
		this.method();
		}
}
