package javabook2.ch06.sec06;

public class TelevisionExample {

	public static void main(String[] args) {
		System.out.println(Television.info);
		Television tv = new Television();
		
		tv.powerOn();
		tv.initChannel(null);
		tv.makeChannel();
		
	}

}
