package Question.ch04;

import java.util.Scanner;

public class Q4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	키보드에서 입력한 3개의 정수중 최소값을 구하는 프로그램을 작성하시오
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		int a = stdIn.nextInt();
		System.out.println("두번째 정수 입력");
		int b = stdIn.nextInt();
		System.out.println("세번째 정수 입력");
		int c = stdIn.nextInt();
		
		int min = a;
		
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min =c ;
		}
		System.out.println("최소값"+min);
	}

}
