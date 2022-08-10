package Question;

import java.util.Scanner;

public class Q4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받으 정수부터 0까지 카운트 다운하는 프로그램 작성
		// 양수만 입력하도록 음수일경우 재실행
		// 카운트 다운종료 후의 변수값을 확인 할수 있도록 할 것.
		
		Scanner stdIn = new Scanner(System.in);
		
		int num = 0;
		while(true) {
			System.out.println("양의 정수 입력");
			num = stdIn.nextInt();
			if (num > 0)
				break;
		}
		while(true) {
			if (num < 0) {
				System.out.println("최종변수 : "+num);
				break;
			} else if (num >= 0){
				System.out.println(num);
				num--;
			}
		}
	}
}
	




//
//num 5
//5 4 3 2 1 
//5 5 5 5 5
//0 1 2 3 4 
