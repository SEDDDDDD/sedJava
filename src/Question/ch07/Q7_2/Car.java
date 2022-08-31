package Question.ch07.Q7_2;

import java.util.Scanner;

// 자동차 클래스 Car 를 사용하여 주행거리르 나타내는 필드와
// 그값을 확인하는 매서드를 추가해서 CarExample 클래스를 작성하시오
// 주행거리를 변화시킬수 있는 메서드 move 를 추가하시오
//1. 매개변수를 입력받아 x축, y축 방향으로 이동가능

// - 자동차 모델 / 차대번호 / 차량 높이 / 차량 길이 / 차량 너비 / 연료량
// 기능 메서드구현
// 사양 표시, 연료량 확인, 급유
public class Car {
//	주행거리는 속력 * 시간
	public String model; // 모델
	public String number; // 차 번호
	public double length; // 길이
	public double height; // 높이
	public double width; // 너비
	public int tankage; // 최대연료량
	public double fuel; // 연료량
	public double sfc;// 연비
	public double totalDistance; // 총주행거리
	public double xDistance; // x축 주행거리
	public double yDistance; // y축 주행거리
	public Scanner stdIn = new Scanner(System.in);
Car(){
}
	
	Car(String model, String number, double length, double heigth, double width, int tankage, double sfc){
		this.model = model;
		this.number = number;
		this.length = length;
		this.height = height;
		this.width = width;
		this.tankage = tankage;
		this.sfc = sfc;
	}
	public void carInfo(String model) {
		
	}
	
	public void getTotalDistance() {
		System.out.println("<총 주행거리>");
		System.out.println("x축 : " + xDistance+"m");
		System.out.println("y축 : " + yDistance+"m");
	}


	public double xMove() {
		System.out.print("x축 방향 입력 > ");
		int x = stdIn.nextInt();
		xDistance += x;
		return xDistance;
	}
	public double yMove() {
		System.out.print("y축 방향 입력 > ");
		int y = stdIn.nextInt();
		yDistance += y;
		return yDistance;
	}
	// 급유
	public void setFuel(int a) {
		fuel = a;
	}
	//연료량 확인
	public double getFuel() {
		return fuel;
	}
	
}
