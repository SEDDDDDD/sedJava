package javabook2.ch06;

public class Car {
		
		// 필드
		String company;
		String model;
		String color;
		int maxSpeed;
		int speed;
		int cc;
	
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
			this(company, model, color ,cc, 300, 60);
			
		}
		
		Car(String company, String model, String color, int maxSpeed, int speed, int cc){
			this.model = model;
			this.color = color;
			this.cc = cc;
			this.maxSpeed = maxSpeed;
			this.speed = speed;
		}
		
		// 메소드
	

}
