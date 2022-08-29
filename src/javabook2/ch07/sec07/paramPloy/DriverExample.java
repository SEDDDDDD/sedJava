package javabook2.ch07.sec07.paramPloy;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver hodong = new Driver();
		hodong.name = "강호동";
		System.out.println(hodong.name);
		
		
		
		//자동 타입 변환
		Vehicle vehicle = new Bus(); // 부모클래스타입에 자식클래스를 할당
		vehicle.color = "회색";
		vehicle.drive();
		vehicle.stop();
//		vehicle.sing();  구현 불가능
//		vehicle.maxPassenger; 구현 불가능
		
		//강제 타입 변환
		Bus bus = (Bus)vehicle;
		bus.sing();
		System.out.println("최대 탑승 승객 : "+bus.maxPassengers);
	}

}
