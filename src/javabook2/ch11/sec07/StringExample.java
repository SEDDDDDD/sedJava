package javabook2.ch11.sec07;

public class StringExample {

	public static void main(String[] args) {
		//replace(변경대상, 변경값문자)
		String oldStr ="지구에너지 고갈 문제를 해결하기 위해\r\n"
				+ "판도라 행성으로 향한 인류는 원주민 '나비족'과 대립하게 된다.\r\n"
				+ "이과정에서, 전직 해병대원 제이크 설리(샘 워싱턴)가\r\n"
				+ "'아바타' 프로그램을 통해 '나비족'의 중심부에 투입되는데...";
		// 나비족 => NAVI
		String newStr = oldStr.replace("나비족", "NAVI");
		System.out.println(newStr);
		
		
		//subsring(시작 인덱스, 끝인덱스) 시작부터 끝까지의 문자열 추출
		String ssn = "560213-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println("생년월일 : "+firstNum);
		
		String genderNum = ssn.substring(7,8);
	
//		System.out.println(genderNum);
		if (genderNum.equals("1")||genderNum.equals("3")) {
			System.out.println("남자");
		} else if(genderNum.equals("2")||genderNum.equals("4")){
			System.out.println("여자");
		} 
		
		//trim() 문자열 양옆 공백 제거
		String tel1 = " 02";
		String tel2 = "1234 ";
		String tel3 = " 1232 ";
		String phone1 = tel1 + tel2 + tel3;
		String phone2 = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(phone1);
		System.out.println(phone2);

	}

}
