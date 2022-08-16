package javabook2.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("그랜저","검정색");
		
		// 필드값 그대로 사용
		System.out.println("제작회사 "+myCar.company);
		System.out.println("내차 : "+myCar.model);
		System.out.println("색깔 "+myCar.color);
		
		System.out.println("최고속도 "+myCar.maxSpeed);
		System.out.println("현재속도이자 수정 전 속도 "+myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 "+myCar.speed);
		
		Car motherCar1 = new Car("현대차", "아반떼", "빨강");
		motherCar1.cc = 2000;
		System.out.println("엄마차1 : "+motherCar1.model);
		System.out.println("색상 : "+motherCar1.color);
		System.out.println("배기량 : "+motherCar1.cc);
		
		System.out.println("===========================");
		
		Car motherCar2 = new Car("코나", "청록색");
		System.out.println("엄마차2 모델 : "+motherCar2.model);
		System.out.println("엄마차2 색상 : "+motherCar2.color);
		System.out.println("엄마차2 제조사 : "+motherCar2.company);
		System.out.println("엄마차2 배기량 : "+motherCar2.cc);
		
		System.out.println("===========================");
		
		Car motherCar3 = new Car("현대차", "소나타", "회색", 3500);
		System.out.println("엄마차3 모델 : "+motherCar3.model);
		System.out.println("엄마차3 색상 : "+motherCar3.color);
		System.out.println("엄마차3 배기량 : "+motherCar3.cc);
		
		Car motherCar4 = new Car("현대", "그랜저", "검정");
		motherCar4.maxSpeed = 350;
		motherCar4.speed = 80;
		System.out.println("내차 : "+ motherCar4.color);
		System.out.println("최고 속도 : "+ motherCar4.maxSpeed +"km/s");
		System.out.println("현재 속도 : "+ motherCar4.speed+"km/s");
		
		
		
		
		
	}

}
