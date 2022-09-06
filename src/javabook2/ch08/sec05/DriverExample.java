package javabook2.ch08.sec05;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();

		Bus bus = new Bus(); // 10번 버스
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);

		bus.checkFare();

		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare();

		// boolean 타입임 //참조변수 instanceof 변환 타입
		// 강제 형변환 하기전에 instanceof 로 손실에 대한 확인을 해주는것이 좋다.
		// 변환 가능 : true
		// 변환 불가능 : false
		// if 문을 이용해서 혹시 모를 문제에 대비할수 있도록 코드작성
		Bus bus1 = null;
		if (vehicle instanceof Bus) {
			System.out.println("변환해도돼");
			bus1 = (Bus) vehicle;
		} else {
			System.out.println("변환 불가능쓰");
		}


		
		bus1.run();
		bus1.checkFare();

	}

}
