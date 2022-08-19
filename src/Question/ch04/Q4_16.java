package Question.ch04;

import java.util.Scanner;

public class Q4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개의 정수값 오름차순
		Scanner stdIn = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int a = stdIn.nextInt();
		System.out.println("두번째 정수 입력");
		int b = stdIn.nextInt();
		System.out.println("세번째 정수 입력");
		int c = stdIn.nextInt();
		
		 
		if (a > b) {
			int temp = a;	// temp 3 a 3 b 1 c 2
			a = b;		// temp 3 a 1 b 1 c 2
			b = temp;	// temp 3 a 1 b 3 c 2
		}
		if (b > c) {		// min 1 c 2 a 3 b 3
			int temp = b;	//
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a + "," + b+","+c);
	}

}
