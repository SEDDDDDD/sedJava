package javabook2.ch11.sec03.clone;

public class MemberExample {

	public static void main(String[] args) {
		// 원본 객체
		Member original = new Member("hong", "홍길동", "1234", 20, true);
		
		// 복제된 객체
		Member cloned = original.getMember();
		
		System.out.println(cloned.adult);
		System.out.println(cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.pwd);
		System.out.println(cloned.age);
		
		
		cloned.pwd="5678";
		
		System.out.println(cloned.pwd);
		
		System.out.println(original.adult);
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.pwd);
		System.out.println(original.age);
		
		
		

	}

}
