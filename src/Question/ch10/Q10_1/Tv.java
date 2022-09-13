package Question.ch10.Q10_1;

public class Tv implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨을 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨을 내립니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	public void changeChannel(int cn) {
		System.out.println("채널을 " + cn + "번으로 변경합니다.");
	}

}
