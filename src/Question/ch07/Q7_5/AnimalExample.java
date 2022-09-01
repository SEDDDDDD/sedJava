package Question.ch07.Q7_5;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog poodle = new Dog("멍멍이", "푸들");
		
		poodle.sound();
		System.out.println(poodle.getName());
		System.out.println(poodle.kind);
		
		
		Cat shortHair = new Cat("야옹이", 3);
		
		shortHair.sound();
		System.out.println(shortHair.getName());
		System.out.println(shortHair.age);

	}

}
