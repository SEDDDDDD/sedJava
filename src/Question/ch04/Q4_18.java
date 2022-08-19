package Question.ch04;

import java.util.Scanner;

public class Q4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3자리 양의 정수를 읽는 프로그램을 작성
		// 입력한 값이 3자리 양의 정수가 아니면 다시 입력하도록
		while(true) {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("세자리 양의 정수를 입력> ");
			int num = stdIn.nextInt();
		
		
			if ((num > 999) || (num < 100)) {
			System.out.println("다시 입력해주세요");
			continue;
			} else {
				System.out.println("입력한 세자리 양의정수 : " + num);
				break;
			}
		}
	}
}
