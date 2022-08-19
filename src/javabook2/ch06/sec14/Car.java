package javabook2.ch06.sec14;

public class Car {
// getter setter
//	:객체 데이터를 외부에서 직접적으로 접근하는 것을 제한
//	
//	객체의 데이터를 외부에서 마음데로 읽고 변경할 경우 
//	잘못되 데이터가 입력될수있음
//	메소드를 통해 우회하여 데이터에 접근하도록 유도함으로써
//	매개값을 검증하여 유효한 데이터만 저장할수있도록함
//	getter만 사용하여 읽기전용 필드로 만드는 것도 가능
	
	
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	//getter
	public int getSpeed() {
		
		return speed;

	}
	public boolean isStop() {
		return stop;
	}
	//setter
	public void setSpeed(int speed) {
		if (speed<0) {
			this.speed=0;
			return;
		}else {
		this.speed = speed;
		}
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
