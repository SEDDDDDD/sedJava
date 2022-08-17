package javabook2.ch06;

public class Car {
		
		// 필드
		String company;
		String model;
		String color;
		int maxSpeed;
		int speed;
		int cc;
		int gas;
		int tank;
	
		// 생성자
		Car(){
		}
		
		Car(String company){
			this(company, "아반떼");
		}
		Car(String company, String model){
			this(company, model, "은색");
		}
		Car(String company, String model, String color){
			this(company, model, color, 3000);
		}
		Car(String company, String model, String color, int cc){
			this(company, model, color ,cc, 300, 60, 0);
			
		}
		
		Car(String company, String model, String color, int maxSpeed, int speed, int cc, int tank){
			this.model = model;
			this.color = color;
			this.cc = cc;
			this.maxSpeed = maxSpeed;
			this.speed = speed;
			this.tank = tank;
		}
		
		// 메소드
		// 메소드
		// 자동차 동작, 기능
		// 1. 기름이 남아 있는지
		boolean isLeftGas(){
			if (gas == 0) {
				System.out.println("Empty");
				return false;
			}
			System.out.println("Not Empty");
			return true;
		}

		// 2. 기름 넣기
		void setGas(int gas){
			this.gas = gas;
			System.out.println("gas is full");
		}
		
		
		// 3. 주행 하기
		void drive() {
			while(true) {
				if (gas > 0) {
					System.out.print("Driving");
					System.out.println(", remain Gas : "+ gas);
					gas -= 1;
					
				} else {
					System.out.print("stop");
					System.out.println(", remain Gas : "+ gas);
					return; // 리턴값이 없는 메소드 이지만 메서드 실행 종료로 return 사용
				}
			}
		}

}
