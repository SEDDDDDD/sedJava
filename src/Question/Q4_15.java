package Question;

import java.util.Scanner;

public class Q4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 정수값을 내림 차순으로 정렬 하는 프로그램
		// 이때, 정수 a에는 b 보다 크거나 가은수가 입력되도록 할 것
		
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int a = stdIn.nextInt();
		System.out.println("두번째 정수 입력");
		int b = stdIn.nextInt();
		
		if (a < b ) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println(a + ", " + b);
		} else {
			System.out.println(a + ", " + b);
		}
		
	}

}
