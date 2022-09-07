package javabook2.ch08.sec06.learn;

public class ImplementsC_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 기본 클래스 객체 활용
		ImplementsC ic = new ImplementsC();
		ic.methodC();
		
		// 인터페이스타입 객체 활용
		InterfaceC ifc = ic;
		ifc.methodC();
		ifc.methodA();
		ifc.methodB();
		
		InterfaceA ifa = ic;
		ifa.methodA();
		
		InterfaceB ifb = ic;
		ifb.methodB();
	}

}
