package Question;

import java.util.Scanner;

public class Q4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 값을 읽어 부호(양수 / 음수 / 0) 판정하는 프로그램 작성
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int input = stdIn.nextInt();

	
		if (input < 0) {
			System.out.println(input + "은 음수 입니다.");
		} else if (input > 0) {
			System.out.println(input + "은 양수 입니다.");
		} else {
			System.out.println(input + " 입니다.");
		}

	}

}
