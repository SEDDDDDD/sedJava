package javabook2.ch06.sec13;

public class A {
	// 필드
	A a1 = new A(true);
	A a2 = new A(10);
	A a3 = new A("java");
	
	public int field1;
	int field2;		
	// default
	private int field3; 
	//해당 클래스 내에서만 접근가능
	
	
	// 생성자==============
	public A(boolean b){
			
	}
	A(int b){	// default
			
	}
	private A(String b){
	//해당 클래스내에서만 접근가능	
	}
	public A() {
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();
	}
		
	// 메소드=============
	public void method1() {
		
	}
	void method2() {
		
	}
	private void method3() {
		
	}
	
	
	
}
