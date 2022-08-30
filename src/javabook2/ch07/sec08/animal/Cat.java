package javabook2.ch07.sec08.animal;

public class Cat extends Animal{
	
	// 생성자
	public Cat(){
		this.kind = "포유류";
		this.legNum = 4;
		this.name = "고양이";
	}

	@Override
	public void sound() {
		System.out.println("야옹");// 추상 메서드
	}
	@Override
	public void breed() {
		System.out.println("고양이가 새끼를 낳다");// 새끼낳다.
	}
	
	public void highJump() {
		System.out.println("높이 점프합니다.");
	}
}
