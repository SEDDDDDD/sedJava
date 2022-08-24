package javabook2.ch07.sec05;

// 자식 클래스
public class SportsCar extends Car {
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 오버라이딩 안됨 ( 부모 클래스 메소드에 final이 선언 되있기 때문 ) 
//	public void stop() {
//		System.out.println("NO");
//		speed =0;
//		}
}
