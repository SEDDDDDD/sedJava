package Question.ch04;

import java.util.Scanner;

public class Q4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 월을 입력받아 계절 출력
		Scanner stdIn = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = stdIn.nextInt();
		
		switch (month){
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("겨울");
				break;
		}
		
		
	
	}

}
