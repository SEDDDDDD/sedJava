package javabook2.ch08.sec06.selfCoding;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC imp = new ImplementationC();
		imp.methodA();
		imp.methodB();
		imp.methodC();
		
		InterfaceA ia = imp;
		ia.methodA();
		
		InterfaceB ib = imp;
		ib.methodB();
		
		InterfaceC ic = imp;
		ic.methodC();
	}

}
