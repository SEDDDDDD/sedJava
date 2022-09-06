package javabook2.ch08.sec05;

public class Bus implements Vehicle {
	public void run() {
		System.out.println("버스를 주행하다");
	}
	
	// 승차요금 확인
	public void checkFare() {
		System.out.println("승차 요금을 확인");
	}
}
