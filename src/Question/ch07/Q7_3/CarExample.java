package Question.ch07.Q7_3;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car gv80 = new Car("GV80", "12가1234", 4945, 1715, 1674, 80, 9.7);
		
		gv80.carInfo(); // 차량 정보
		
		gv80.setFuel(80); // 연료 충전
		
		System.out.println(gv80.getFuel());
		
		
		car.xMove();
		car.yMove();
	
		car.getTotalDistance();
		
		car.xMove();
		car.getTotalDistance();
		
		
		SuperCar supercar = new SuperCar();
		supercar.xMove();
		supercar.yMove();
		System.out.print("supercar ");
		supercar.getTotalDistance();
	}
}
