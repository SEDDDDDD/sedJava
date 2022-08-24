package javabook2.ch07.sec07;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Parent parent = child;
		parent.method1(); // 부모클래스 메서드 호출
		parent.method2(); // 자식클래스에서 재정의된 메서드 호출
//		parent.method3();	// 호출 불가능
	}

}
