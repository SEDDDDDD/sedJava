package javabook2.ch06.sec06;

import java.util.Random;
import java.util.Scanner;


public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	
	// 채널
	int[] channel = new int[100];
	int currentChannel;
	
	int changingChannel = 0;
	// 밝기
	int brighteness;
	
	static {
		info = company+" "+model; // 정적 필드만 사용가능
		powerOn();
	}
	
	
	void makeChannel() {
		Random rand = new Random();
		System.out.println("채널수 : "+channel.length);
		for(int i=0; i<=100;i++)
			channel[i] = i;
	}
	
	// 채널 변경
	void changeChannel(int changingChannel) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Input Channel : ");
		currentChannel = stdIn.nextInt();
	}
	
	// 초기 채널 0번
	void initChannel(int[] channel) {
		this.currentChannel = channel[0];
	}
	
	// 전원온
	static void powerOn() {
		System.out.println("Power On");
		
		// 정적 메소드에서 인스턴스 멤버를 사용하고 싶다면
		// 객체를 먼저 생성 하고 참조 변수로 접근 가능
		Television tv1 = new Television();
//		tv1.currentChannel = 
	}
	// 전원오프
	static void powerOff() {
		System.out.println("Power Off");
	}
}
