package javabook2.ch07.sec08.animal;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
		this.legNum = 4;
		this.name = "개";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");// 추상 메서드
	}
	@Override
	public void breed() {
		System.out.println("강아지가 새끼를 낳다");// 새끼낳다.
	}
	public void wellSniff() {
		System.out.println("냄새를 잘 맡습니다.");
	}
}
