package javabook2.ch06;

public class Car {
		
		// 필드
		String company;
		String model;
		String color;
		int maxSpeed = 350;
		int speed;
		int cc;
	
		// 생성자
		Car(String company, String model){
			this(company, model, "은색");
		}
		Car(String company, String model, String color){
			this(company, model, color, 3000);
		}
		Car(String company, String model, String color, int cc){
			this.model = model;
			this.color = color;
			this.cc = cc;
			this.company = company;
		}
		
		Car(String company, String model, String color, int cc, int maxSpeed){
			this(company, model, color, cc);
//			this.model = model;
//			this.color = color;
//			this.cc = cc;
			this.company = company;
			this.maxSpeed = maxSpeed;
		}
		
		// 메소드
	

}
