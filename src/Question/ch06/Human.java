package Question.ch06;

public class Human {
	// 이름 신장 체중 등을 멤버로 가지는 사람 클래스를 작성
	//예)이름 : 홍길동, 신장 : 170, 체중 : 65kg  // 이름 : 임꺽정 신장: 175 체중 : 75
	
	//필드
	String name;
	int height;
	int weight;
	int changeWeight;
	
	// 생성자
	Human(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드
	void bodyInfo() {
		System.out.println("name : "+name);
		System.out.println("height : "+height+"cm");
		System.out.println("weight : "+weight+"kg");
		
	}
	void diet(int changeWeight) {
		int result = weight - changeWeight;
		if (result < 0) {
			System.out.println("Weight error : Weight < 0");
			return;
		} else {
			weight = result;
		}
	}
			
	void bulkUp(int changeWeight) {
		if (changeWeight < 0) {
			System.out.println("Input error : changeWeight < 0");
			return;
		}else {
		weight += changeWeight;
		}
	}
}
	
	
	

