package Question.ch08.Q8_1;

public class AirConditioner {
 
	public static void main(String[] args) {
		// 01, 02, 03 년 에어컨이 각각 출시
		// 에어컨 클래스 사용하여 에어컨 실행
		// 연도별 에어컨 기능 존재
		// 01 : 온도제어 , 02 : 공기 청정, 03 : 음성 출력
		// 인터페이스를 사용하여 구현( 03년 에어컨은 01, 02 기능 모두 쓸 수 있음)
		AirConditionerImplement AC2003 = new AirConditionerImplement();
		AirConditioner2001 AC2001 = AC2003;
		AirConditioner2002 AC2002 = AC2003;
		
		System.out.println("====2003====");
		AC2003.AirCleaner();
		AC2003.tempControl();
		AC2003.voiceControl();
		System.out.println("============");
		System.out.println("====2002====");
		
		AC2002.AirCleaner();
		
		
		System.out.println("============");
		System.out.println("====2001====");

		AC2001.tempControl();

		System.out.println("============");
	}

}
