package Question.ch07.Q7_2;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();

		
		
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
