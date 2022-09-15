package javabook2.ch11.sec03.toString;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company= company;
		this.os = os;
	}
	// 기능 : 필드값 출력
	// 입력값 :
	// 리턴값 : 
	@Override
	public String toString() {
//		return company+","+os;
		
		 return "SmartPhone [company" + company +", os=" + os + "]";
	}
	
	
}
