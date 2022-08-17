package javabook2.ch06.constructorThis;

// 라이브러리 클래스
public class Car1 {
	// 필드
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자
	Car1(){
//		this.model = "kona";
//		this.color = "jaju";
//		this.maxSpeed = 250;
		this("kona", "jaju", 250);
	}
	
	Car1(String model){
		this(model, "gray"); 
		// 생성자 안에서 가장 첫번째줄에 작성되야함
		
		this.maxSpeed = 230;
//		this.model = model;
//		this.color = "gray";
//		this.maxSpeed = 230;
		
		
	}
	
	Car1(String model, String color){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 300;
		this(model, color, 300);
		
	}
	Car1(String model ,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	
	
}
