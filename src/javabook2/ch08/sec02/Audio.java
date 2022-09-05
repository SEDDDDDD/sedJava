package javabook2.ch08.sec02;

public class Audio implements RemoteControl {
	
	// 필드
	private int volume;
	
	// 생성자
	
	
	// 메서드
	// 추상메서드 재정의
	// 상수 필드를 사용 시 인터페이스 이름으로 접근해서 사용
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	// powerOff : 끄다
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
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
		System.out.println("현재 오디오 볼륨 : "+ this.volume);
	}
	
	// 디폴트 메서드
	@Override
	public void setMute(boolean mute) {
		if (mute) {
		System.out.println("오디오 무음");
		}else {
		System.out.println("오디오 무음 해제");
		}
	}
	
}
