package javabook2.ch06.sec11;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person tom = new Person("123452-1496844", "Tom Cruise");
		System.out.println(tom.name);
		System.out.println(tom.nation);
		tom.nation = "US";
		tom.name = "Tom hanks";
		Person kang = new Person("321654-1325456", "kang kam chan");
		System.out.println("=================");
		System.out.println(tom.name);
		System.out.println(tom.nation);
		System.out.println(tom.ssn);
		System.out.println("=================");
		System.out.println(kang.name);
		System.out.println(kang.nation);
		System.out.println(kang.ssn);
	}

}
