package javabook2.ch08.sec05;

public class Car {
	//필드
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
//	Tire backRightTire = new HankookTire();
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	//생성자
	
	
	//메소드
	
	//주행하다
	void drive() {
	System.out.println("주행하다");
//	frontLeftTire.roll();
//	frontRightTire.roll();
//	backLeftTire.roll();
//	backRightTire.roll();

	for(Tire tire :tires) {
		tire.roll();
		}
	}
}
