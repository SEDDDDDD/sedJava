package Question.test;

public class SmartPhone implements Alram, Phone, Messenger{
	@Override
	public void playMusic(String title) {
		System.out.println(title);
	}
	@Override
	public void beep() {
		System.out.println("beep");
	}
	@Override
	public void makeCall(String PhoneNum) {
		System.out.println("전화걸다");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 받다");
	}
	@Override
	public void sendMsg(String phoneNum, String msg) {
		System.out.println(phoneNum);
	}
	@Override
	public void receiveMsg() {
		System.out.println("메세지 도착");
	}
}
