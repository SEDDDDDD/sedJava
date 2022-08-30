package Question.ch07.Q7_2;

import java.util.Scanner;

// 자동차 클래스 Car 를 사용하여 주행거리르 나타내는 필드와
// 그값을 확인하는 매서드를 추가해서 CarExample 클래스를 작성하시오
// 주행거리를 변화시킬수 있는 메서드 move 를 추가하시오
//1. 매개변수를 입력받아 x축, y축 방향으로 이동가능
public class Car {
//	주행거리는 속력 * 시간
	public double totalDistance = 0;
	public double xDistance;
	public double yDistance;
	public Scanner stdIn = new Scanner(System.in);


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

}
