package javabook2.ch08.sec06.selfCoding;

public interface InterfaceC extends InterfaceA, InterfaceB {
	void methodC();
	public default void methodD() {
		System.out.println("흐하흐하");
	}
}
