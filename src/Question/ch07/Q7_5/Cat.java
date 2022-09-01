package Question.ch07.Q7_5;

public class Cat extends Animal{
	public int age;
	Cat(String name, int age) {
		this.setName(name);
		this.age = age;
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

	
}
