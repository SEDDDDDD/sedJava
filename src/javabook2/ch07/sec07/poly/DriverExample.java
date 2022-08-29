package javabook2.ch07.sec07.poly;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver kenneth = new Driver();
		VehicleClass1 Kona = new VehicleClass1();
		VehicleClass1 vehicle1 = new VehicleClass1();
		VehicleClass2 vehicle2 = new VehicleClass2();
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		
		kenneth.drive1(Kona);
		kenneth.drive1(vehicle1);
		kenneth.drive2(vehicle2);
		kenneth.drive2(bus);
		kenneth.drive1(taxi);
	}

}
