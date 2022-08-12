package javabook2.ch06;

public class StduentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체 참조");
		
		
		Student s2 = new Student();
		System.out.println("s2 변수가 다른 Student 객체 참조 (new 를 썼기 때문 : 새로운 객체 생성)");
	}

}
