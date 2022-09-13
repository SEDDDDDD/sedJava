package javabook2.ch10.sec02;

public class Cat extends Animal {
	void jump() {
		System.out.println("점프하다");

	}

	@Override
	void eat() {
		System.out.println("고양이가 먹다");
	}
}
