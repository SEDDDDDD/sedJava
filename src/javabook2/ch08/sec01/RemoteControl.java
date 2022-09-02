package javabook2.ch08.sec01;

public interface RemoteControl {
	// 상수(속성, 명사)
	// public static final 생략해도 컴파일시 자동 생성
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 클래스처럼 정적블록에 초기화 하는 것은 불가능
//	static {
//		MIN_VOLUME =0;
//	}
	
	// 추상메서드(방법, 기능, 동작)
	// public abstract 생략해도 컴파일시 자동 생성
	// powerOn  : 켜다
	void turnOn();
	
	// 입력 볼륨 수치
	// setVolume : 볼륨 설정
		void setVolume(int volume);
		
	// powerOff : 끄다
	void turnOff();
	
	// default 메서드
	// public 생략해도 컴파일시 자동 생성
	// 음소거하다
	// 입력값 : 음소거 여부 입력
	default void setMute(boolean mute) {
		if (mute) {
		System.out.println("무음");
		}else {
		System.out.println("무음 해제");
		}
	}
	// 정적메서드
	// public 생략해도 컴파일시 자동 생성
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
