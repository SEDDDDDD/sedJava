package Question.ch07.Q7_6;

import java.util.Random;

public class Computer extends Player{
	
	@Override
	public int hand() {
		Random rnd = new Random();
		hand = rnd.nextInt(3);
		return hand;
	}


 
}
