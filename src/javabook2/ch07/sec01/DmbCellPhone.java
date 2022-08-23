package javabook2.ch07.sec01;

public class DmbCellPhone extends CellPhone{
	// 필
	int channel;	// 현재 방송 채널
	// 생
	DmbCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel = channel;
	}
	// 메
	void turnOnDbm() {
		System.out.println("turn on DMB");// 방송 수신 시작
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("change Channel : "+channel);// 방송 채널 변경
	}
	void turnOffDmb(){
		System.out.println("turn off DMB");// 방송 수신 종료
	}
}
