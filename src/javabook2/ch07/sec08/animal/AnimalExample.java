package javabook2.ch07.sec08.animal;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal = new Animal();  추상 클래스는 객체생성 불가능
		Cat cat = new Cat();
		Dog dog = new Dog();
		Dove dove = new Dove();
		
		System.out.println("동물이름 : "+cat.name);
		System.out.println("종 구분 : "+cat.kind);
		System.out.println("고양이 다리개수는 : "+cat.legNum+"개");
		cat.breed();
		cat.breath();
		cat.sound();
		cat.highJump();
		
		System.out.println("-------------------------");
		
		System.out.println("동물이름 : "+dog.name);
		System.out.println("종 구분 : "+dog.kind);
		System.out.println("개 다리개수는 : "+dog.legNum+"개");
		dog.breed();
		dog.breath();
		dog.sound();
		dog.wellSniff();
		
		System.out.println("-------------------------");
		
		System.out.println("동물이름 : "+dove.name);
		System.out.println("종 구분 : "+dove.kind);
		System.out.println(dove.name+"의 다리개수는 : "+dove.legNum+"개");
		dove.breed();
		dove.breath();
		dove.sound();
		dove.fly();
		
	}

}
