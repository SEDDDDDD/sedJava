package javabook2.ch06.constructorThis;

// 실행 클래스
public class Car1Example {
	
	// 필드
	
	// 생성자
	
	// 메소드
	public static void main(String[] args) {
	
		Car1 myCar = new Car1();
		Car1 broCar = new Car1("avante");
		Car1 fatherCar = new Car1("granduer", "black");
		
		// 내차
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed+"km");
		System.out.println("====================");
		
		// 동생차
		System.out.println(broCar.model);
		System.out.println(broCar.color);
		System.out.println(broCar.maxSpeed+"km");
		System.out.println("====================");
		
		// 아빠차
		System.out.println(fatherCar.model);
		System.out.println(fatherCar.maxSpeed+"km");
		System.out.println(fatherCar.color);
		
	}

}
