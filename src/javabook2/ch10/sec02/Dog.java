package javabook2.ch10.sec02;

public class Dog extends Animal {
	void run() {
		System.out.println("달린다");
	}

	@Override
	void eat() {
		System.out.println("개가 먹다");
	}

}
