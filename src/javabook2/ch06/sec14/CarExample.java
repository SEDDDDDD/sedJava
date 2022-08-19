package javabook2.ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		int speed = myCar.getSpeed();
		System.out.println("Current Speed : "+speed);
		myCar.setSpeed(200);
		int speed1 = myCar.getSpeed();
		System.out.println("Current Speed : "+speed1);

		if (myCar.isStop()) {
			myCar.setStop(true);
		}
			
}
}

