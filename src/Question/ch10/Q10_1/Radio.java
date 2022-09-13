package Question.ch10.Q10_1;

public class Radio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("라디오 볼륨을 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("라디오 볼륨을 내립니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 전원을 끕니다.");
	}

	public void HzChange(double hz) {
		System.out.println("주파수를 " + hz + "Hz 로 바꿉니다.");
	}
}
