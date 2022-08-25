package javabook2.ch07.sec07.car;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//메
	// 기능 : 자동차를 주행하다
	// 입력값 : 없음
	// 출력값 : 어떤 바퀴에 문제가 생겼는가
	int drive() {
		System.out.println("Driving");
		if (frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if (backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("Stop");
	}
}

