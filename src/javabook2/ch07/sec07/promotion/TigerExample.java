package javabook2.ch07.sec07.promotion;

public class TigerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1 = new Tiger();

		Animal animal = t1;
		animal.eat();
		animal.sleep();
		t1.howl();
	}

}
