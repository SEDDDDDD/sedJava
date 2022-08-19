package Question.ch04;

import java.util.Scanner;

public class Q4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = stdIn.nextInt();
		if (num<0) {
			System.out.println("이 값은 음수 입니다.");
		}
		} while (num>0);
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
