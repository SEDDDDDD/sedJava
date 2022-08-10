package javabook2.ch05;

public class EnumMethod {

	public static void main(String[] args) {

		Week today = Week.SUNDAY;
		
		String name = today.name();		// 상수 이름을 리턴
		int ordinal = today.ordinal();  // 몇번째 열거객체인지 리턴
		System.out.println(name);		// SUNDAY
		System.out.println(ordinal);	// 6 ( 0 : MONDAY, 1 : TUESDAY, 2 : WEDNESDAY ..., 6 : SUNDAY
										// 열거객체를 선언한 Week.java 파일을 보면 한번에 이해됨 
		
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		// 열거객체1.compareTo(열거객체2) : 열거객체2를 기준으로 열거객체1에서 몇번째 위치인지 리턴 
		int result1 = day1.compareTo(day2);	// 수요일기준으로 월요일은 앞으로 2번째에 위치
		int result2 = day2.compareTo(day1);	// 월요일기준으로 수요일은 뒤로 2번째에 위치
		System.out.println(result1); // -2
		System.out.println(result2); // 2
		
		// 열거명.valueOF("열거객체명") : 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 리턴
		// 문자열을 입력받아 열거 객체로 변환 할때 사용
		Week weekDay = Week.valueOf("SUNDAY");
		System.out.println(weekDay);
		
		//values() : 열거 타입의 객체들을 배열로 만들어서 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}


	}

}
