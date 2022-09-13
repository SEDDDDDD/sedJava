package javabook2.ch10.sec02;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.run();
		dog.eat();

		Cat cat = new Cat();
		cat.jump();
		cat.eat();

		Animal animal = new Dog();
		animal.eat();
		if (animal instanceof Dog) {
			Dog dog1 = (Dog) animal;
			dog1.run();
			dog1.eat();
		}

		if (animal instanceof Cat) {
			Cat cat1 = (Cat) animal;
		} else {
			System.out.println("오류");
		}
	}

}
