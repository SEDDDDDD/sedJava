package javabook2.ch08.sec04_sec05backup;

public class CarExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.drive();
		myCar.tires[2] = new kumhoTire();
		myCar.tires[3] = new kumhoTire();
		
		myCar.drive();
//		
		
	}

}
