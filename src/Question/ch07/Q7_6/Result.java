package Question.ch07.Q7_6;

import java.util.Scanner;

public class Result {
	static Scanner stdIn = new Scanner(System.in);
 // 입력값 플레이어1 손, 플레이어2 손
	static int judgeWinner(int p1, int p2) {
		if ((p1==0 && p2==1) || (p1==1 && p2==2)||(p1==2 && p2==0))
			{
				return 2; // p2 win
			} else if((p1==0 && p2==2)||(p1==1 && p2==0)||(p1==2&&p2==1))
			{
				return 1; //p1 win
			} else {
				return 0; // draw
			}
	}
	static int retry() {
		System.out.println("한판 더할래?");
		System.out.println("1 : 한판 더");
		System.out.println("2 : 종료");
		System.out.print(">>>>");
		int c = stdIn.nextInt();
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		Human human = new Human();
		
		String[] hands = {"가위", "바위", "보"};
		
		do{
			int hand_human = human.hand();
		
			int hand_com = computer.hand();
			
			int result =judgeWinner(hand_human, hand_com);
			
			switch(result) {
			case 0:
				System.out.println("Draw");
				break;
			case 1:
				System.out.println("P1 Win");
				break;
			case 2:
				System.out.println("P2 Win");
				break;
			}
			
			
			} while((retry()==1));
		
//		int c;
//		
//		do {
//			int a = human.hand();
//			int b = computer.hand();
//			System.out.println(hands[a]);
//			System.out.println(hands[b]);
//			
//			if ((a==0 && b==1) || (a==1 && b==2)||(a==2 && b==0))
//			{
//				System.out.println();
//				System.out.println("Com win");
//			} else if((a==0 && b==2)||(a==1 && b==0)||(a==2&&b==1))
//			{
//				System.out.println("Player win");
//			} else {
//				System.out.println("Draw");
//			}
//			System.out.println("1 : 한번더");
//			System.out.println("2 : 종료");
//			System.out.print(">>>>");
//			c = stdIn.nextInt();
//		} while(c == 1);
//		stdIn.close();
	}

}
