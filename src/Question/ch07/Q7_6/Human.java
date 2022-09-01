package Question.ch07.Q7_6;

import java.util.Scanner;

public class Human extends Player{
	Scanner stdIn = new Scanner(System.in);
	@Override
	public int hand() {
		do {
			System.out.print("가위:0, 바위:1, 보:2 >");
			hand = stdIn.nextInt();	
		}while(hand<0 || hand>2);
		
		return hand;
		 
	}

}
