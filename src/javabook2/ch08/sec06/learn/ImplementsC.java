package javabook2.ch08.sec06.learn;

public class ImplementsC implements InterfaceC{
	
	@Override
	public void methodC() {
		System.out.println("run method C");
	}
	@Override
	public void methodA() {
		System.out.println("run method A");
	}
	@Override
	public void methodB() {
		System.out.println("run method B");
	}
}
