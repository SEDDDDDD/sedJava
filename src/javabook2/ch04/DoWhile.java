package javabook2.ch04;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("종료하려면 q 를 입력하세요");
		
		Scanner stdIn = new Scanner(System.in);
		String inputStr;
		
		do {
			System.out.print(">");
			inputStr = stdIn.nextLine();
			System.out.println(inputStr);
			
		} while (!inputStr.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
