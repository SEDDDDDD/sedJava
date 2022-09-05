package javabook2.ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 객체화
		RemoteControl rc;
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();
		RemoteControl.changeBattery();
		
		
		RemoteControl rc1 = new RemoteControl() {
			public void turnOn() {
				
			}
			
			// 입력 볼륨 수치
			// setVolume : 볼륨 설정
			public void setVolume(int volume) {
				
			}
				
			// powerOff : 끄다
			public void turnOff() {
				
			}
		};
		
		Searchable rc2 = new SmartTelevision();
		rc2.search("www.naver.com");
				
	}

}
