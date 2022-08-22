package Question.ch06;

import java.util.Scanner;

public class SignOf {
	// 필드
	// 생성자
	// 메서드

	static int signOf(int input) {
		int result = 0;
		if (input < 0) {
			return result=-1;
		} else if (input == 0) {
			return result;
		}
		return result = 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Integer > ");
		int input = stdIn.nextInt();
		
		int result = signOf(input);
		
		System.out.println(result);

	}
}
