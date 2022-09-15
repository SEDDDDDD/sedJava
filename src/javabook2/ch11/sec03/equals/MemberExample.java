package javabook2.ch11.sec03.equals;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("red");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("blue");

		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2 는 동등");
		} else {
			System.out.println("obj1 과 obj2 는 동등하지 않음");
		}

		if (obj2.equals(obj3)) {
			System.out.println("obj2 와 obj3 는 동등");
		} else {
			System.out.println("obj2 와 obj3 는 동등하지 않음");
		}

	}

}
