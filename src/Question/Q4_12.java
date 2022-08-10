package Question;

import java.util.Scanner;

public class Q4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2개의 정수값을 익어서
//		후자가 전자의 약수이면 B는 A 의 약수라고 표시
//		그렇지 앟으면 아니라고 표시하는 프로그램 작성
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요");
		int A = stdIn.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int B = stdIn.nextInt();
				
		if ( (B > 0) && (A > 0) && (A % B == 0) ) {
			System.out.println( "B 는 A 의 약수");
		} else if ((B < 0) || (A < 0)) {
			System.out.println("양의 정수만 입력하세요");
			
		}
		
	}

}
