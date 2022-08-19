package Question.ch03;

import java.util.Random;
import java.util.Scanner;

public class Q3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드에서 입력한 정수값을 +5 또는 -5 범위의 랜덤 정수값을 생성
		Random rnd = new Random();
		Scanner stdId = new Scanner(System.in);
//		System.out.println("정수를 입력하시오");
//		int x = stdId.nextInt();
//		int y = rnd.nextInt(x-5, x+6);
//		System.out.println("정수값 : "+ x);
//		System.out.println("입력값의 +-5 범위의 난수를 생성합니다.");
//		System.out.println("생성 된 값: "+ y);
		
		
	
		
		// 키보드로 자신의 성과 이름, 주소를 입력받아 출력하는 프로그램을 작성하시오.
		System.out.println("성을 입력하시오");
		String a = stdId.nextLine
				();
		System.out.println("이름을 입력하시오");
		String b = stdId.nextLine();
		System.out.println("주소를 입력하시오");
		String c = stdId.nextLine();
		
		
		System.out.println("성 :"+ a);
		System.out.println("이름 :"+ b);
		System.out.println("주소 :"+ c);
		
		stdId.close();
	}

}
