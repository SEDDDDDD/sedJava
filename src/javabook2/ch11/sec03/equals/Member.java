package javabook2.ch11.sec03.equals;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	// Object(부모) 클래스의 equals() 재정의
	// 해당 객체의 필드값을 비교하는 형태로 재정의
	// 입력값 : 비교대상 객체
	// 리턴값 : (필드)값이 같다 : true, (필드)값이 다르다 : false
	
	// 실제 객체는 다르지만 필드값이 같으면 같은 객체로 취급하려는 경우 사용
	@Override
	public boolean equals(Object obj) {
		// 강제형변환 시 부모클래스의 객체인지 꼭 확인해야함
		if (obj instanceof Member) { 	
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
