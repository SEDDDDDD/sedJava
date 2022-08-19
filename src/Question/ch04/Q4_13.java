package Question.ch04;

import java.util.Scanner;

public class Q4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력한 정수값이 10의 배수면 10의 배수입니다.
		// 그렇지 않으면 10의 배수가 아닙니다. 라고 표시하는 프로그램
		// 음수 읽은 경우 음의 정수 값을 입력했습니다.라고 출력
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int num = stdIn.nextInt();
		if (num < 0) {
			System.out.println("0 또는 음의 정수 값을 입력함");
		} else if (num % 10 == 0) {
			System.out.println("10의 배수입니다.");
		} else {
			System.out.println("10의 배수가 아닙니다.");
		}
	}

}
