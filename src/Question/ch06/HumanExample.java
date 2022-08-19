package Question.ch06;

public class HumanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("Hong", 170, 65);
		
//		h1.bodyInfo();
		
		Human h2 = new Human("Lim", 175, 75);
	
//		h2.bodyInfo();
		
		h1.bulkUp(3);
		h1.bodyInfo();
		
		h2.diet(3);
		h2.bodyInfo();
		
	}

}
