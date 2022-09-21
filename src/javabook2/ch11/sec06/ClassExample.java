package javabook2.ch11.sec06;

public class ClassExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage());
		System.out.println();
		
		try {
		Class clazz2 = Class.forName("javabook2.ch11.sec06.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackage());
		System.out.println();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
//		
		
	}

}
