package javabook2.ch07.sec02;

public class Computer extends Calculator{
	//필
	
	//생
	
	//메
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 메소드 실행");
		double result = Math.PI * r * r;
		return result;
	}
	
}
