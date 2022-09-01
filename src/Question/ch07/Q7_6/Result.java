package Question.ch07.Q7_6;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		Human human = new Human();
		Scanner stdIn = new Scanner(System.in);
		String[] hands = {"가위", "바위", "보"};
		int c;
		
		do {
			int a = human.hand();
			int b = computer.hand();
			System.out.println(hands[a]);
			System.out.println(hands[b]);
			
			if ((a==0 && b==1) || (a==1 && b==2)||(a==2 && b==0))
			{
				System.out.println();
				System.out.println("Com win");
			} else if((a==0 && b==2)||(a==1 && b==0)||(a==2&&b==1))
			{
				System.out.println("Player win");
			} else {
				System.out.println("Draw");
			}
			System.out.println("1 : 한번더");
			System.out.println("2 : 종료");
			System.out.print(">>>>");
			c = stdIn.nextInt();
		} while(c == 1);
	}

}
