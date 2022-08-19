package Question.ch04;

import java.util.Scanner;

public class Q4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner stdIn = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int input = stdIn.nextInt();
			
			
			switch (input) {
				case 1: // 예금
					System.out.print("예금액을 입력> ");
					int inputDeposit = stdIn.nextInt();
					if (inputDeposit <= 0) {
						System.out.println("예금액 입력오류");
						
					} else {
						balance += inputDeposit;
					}
					break;
				case 2:
					System.out.print("출금액을 입력> ");
					int inputwithraw = stdIn.nextInt();
					if ((inputwithraw > balance) || (inputwithraw <= 0)) {
						System.out.println("출금액 입력오류");
						
					}else {
						balance -= inputwithraw;
					}
					break;
				case 3:
					System.out.println("잔고> "+ balance);
					break;
				case 4:
					run = false;
				default:	
					System.out.println("번호를 정확히 입력");
			}
				
			

		}
		System.out.println("프로그램 종료");
	}

}
