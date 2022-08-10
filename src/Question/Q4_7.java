package Question;

import java.util.Scanner;

public class Q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력하세요");
		num = stdIn.nextInt();
		if (num < 0) {
			System.out.println("절대값 :" + -num);
		} else {
			System.out.println("절대값 :" + num);
		} 
	}

}
