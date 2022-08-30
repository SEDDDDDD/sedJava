package javabook2.ch07.sec08.animal;

public abstract class Animal {
	public String name;	// 이름
	public String kind; // 종
	public int legNum; // 다리수

	public void breath() {
		System.out.println("호흡하다");
	}

	public void eat() {
		System.out.println("먹다");
	}

	public abstract void sound(); // 추상 메서드

	public abstract void breed(); // 새끼낳다.
}
