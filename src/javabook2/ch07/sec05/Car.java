package javabook2.ch07.sec05;

// 부모클래스
public class Car {
	//필
	public int speed;
//	int tire;
//	String color;
	//생
	
	//메
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("Car is stop");
		speed = 0;
	}
}
