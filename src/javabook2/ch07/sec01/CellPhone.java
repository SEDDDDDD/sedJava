package javabook2.ch07.sec01;

import java.util.concurrent.TimeUnit;

public class CellPhone {
	String model;
	String color;
	
	
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("Power On");
	}
	void powerOff() {
		System.out.println("Power Off");
	}
	void bell() {
		System.out.println("Ringing");
	}
	void sendVoice(String message) {
		System.out.println("me : "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("someone : "+ message);
	}
	void hangUp() {
		System.out.println("Hangup phone");
	}
	void sendMessage(String message) {
		System.out.println("보내는 내용 : "+message);
	}
	void reboot() {
		powerOff();
		
		powerOn();
	}
}
