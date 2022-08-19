package Question.ch04;

import java.util.Scanner;

public class Q4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2자리 정수 값(10~99)을 맞추는 숫자맞추기 게임
		//( 난수생성 if문, 그리고 do-while 문 사용할것)
		while(true) {
			int rnd = (int)(Math.random()*100)+10;
			Scanner stdIn = new Scanner(System.in);
			System.out.println("10~99 사이의 숫자를 맞추세요");
			if (rnd < 100) {
				do {
					System.out.print("정답을 입력하세요");
					int input = stdIn.nextInt();
	
					if (input < rnd) {
						System.out.println("더 큰 숫자입니다.");
					} else if (input > rnd) {
						System.out.println("더 작은 숫자입니다.");
					} else if (input == rnd) {
						System.out.println("정답입니다.");
						break;
					}
				} while (true);	
				break;
			} else {
				continue;
			}
		}
	}

}
