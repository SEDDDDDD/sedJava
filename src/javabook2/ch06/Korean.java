package javabook2.ch06;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;		// 이름
	String ssn;			// 주민번호
	String phone;		// 전화번호
	int birthYear;		// 탄생년도
	boolean corona;		// 코로나 접종여부
			
	// 생성자
	Korean(){
		
	}
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, String ssn, String phone, int birthYear){
//		this.name = name;
//		this.ssn = ssn;
		this(name, ssn);
		this.phone= phone;
		this.birthYear = birthYear;
	}
	
	// 메소드
}
