package javabook2.ch07.sec04;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//필
	public int flyMode = NORMAL; 
	//생
	
	//메
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("SUPERSONIC FYLING");
		} else {
			super.fly();	// 부모클래스(airplane) 의 fly 메소드를 사용
		}
	}
}
