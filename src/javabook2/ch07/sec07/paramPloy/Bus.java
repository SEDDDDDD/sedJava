package javabook2.ch07.sec07.paramPloy;
//자식클래스
public class Bus extends Vehicle{
	//필드
	int maxPassengers = 45;
	
	//메소드
	@Override
	void drive() {
		System.out.println("버스가 주행합니다.");
	}
	// 노래방 기능
	void sing() {
		System.out.println("버스에서 노래 합니다.");
	}
}
