package Question.ch07.Q7_5;

public class Dog extends Animal{
	public String kind;
	
	Dog(String name, String kind) {
		this.setName(name);
		
		this.kind = kind;
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
