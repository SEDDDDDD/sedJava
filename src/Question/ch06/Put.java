package Question.ch06;

import java.util.Scanner;

public class Put {

	static void putChar(char chr, int num) {
		for (int i = 1; i <=num; i++) {			
				System.out.print(chr);
		}
	}
	
	static void putStar(int num) {
		putChar('*', num);
	}
	

	static void trinAngle(int num) {
		for(int i=1;i<=num;i++) {
			putStar(i);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Input String > ");
		char inputChar = stdIn.next().charAt(0);
		
		System.out.println("Input Number > ");
		int inputNum = stdIn.nextInt();

		putChar(inputChar, inputNum);
		putStar(inputNum);
		
		System.out.println("Input Number > ");
		int inputDan = stdIn.nextInt();
		trinAngle(inputDan);
		
	}

}
