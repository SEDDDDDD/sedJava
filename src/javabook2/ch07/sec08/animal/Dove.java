package javabook2.ch07.sec08.animal;

public class Dove extends Animal{
	public Dove() {
		this.name = "비둘기";
		this.kind = "새";
		this.legNum = 2;
	}
	public void fly() {
		System.out.println("날아간다");
	}
	
	@Override
	public void sound() {
		System.out.println("구구");// 추상 메서드
	}
	@Override
	public void breed() {
		System.out.println("알을 낳다");// 새끼낳다.
	}
}
