package javabook2.ch03;
// 자동 임포트 : ctrl + shift + o
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 입력
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 갑을 입력하시오");
		int intVal =  stdIn.nextInt();
		
		System.out.println("실수 갑을 입력하시오");
		double doubleVal =  stdIn.nextDouble();
		
		// 출력
		System.out.println("입력된 값: "+intVal);
		System.out.println("입력된 값: "+doubleVal);
		stdIn.close();
	}	

}
