package javabook2.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("유재석", "123456-131342");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
				
		Korean k2 = new Korean("임꺽정", "123456-123412", "010-1234-5689", 1991);
		
		System.out.println(k1.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
	}

}
