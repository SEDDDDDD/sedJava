package javabook2.ch08.sec01;

// 구현 클래스 
public class Television implements RemoteControl {
	private int volume;
	
	// 추상메서드 재정의
	// 상수 필드를 사용 시 인터페이스 이름으로 접근해서 사용
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
	}
	
	
		
	// powerOff : 끄다
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
	}
	// 입력 볼륨 수치
	// setVolume : 볼륨 설정
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+ this.volume);
	}
}
