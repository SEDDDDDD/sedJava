package Question.ch10.Q10_1;

public class RemoteControllerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc1 = new Tv();
		rc1.turnOn();
		rc1.turnOff();
		
		RemoteControl rc2 = new Radio();
		rc2.volumeUp();
		
		if (rc1 instanceof Tv) {
			Tv tv = (Tv)rc1;
			tv.turnOff();
			tv.changeChannel(3);
		}
		
		if (rc1 instanceof Radio) {		
			Radio radio = (Radio)rc1; 	// 런타임 예외 발생
			radio.HzChange(107.7);	
		}
		
		
		
		
	}

}
