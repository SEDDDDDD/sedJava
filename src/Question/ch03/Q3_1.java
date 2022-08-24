package Question.ch03;

import java.util.Random;
import java.util.Scanner;
public class Q3_1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		//3-1
		int x = 132;
		int y = 23;
		System.out.println(x+y);
		System.out.println((x+y)/2);
//		
		//3-2
		double x1 = 13.2;
		double y1 = 123;
		System.out.println((x1+y1)/2);
				
		//3-3
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수값을 입력하세요 : ");
		int intVal = stdIn.nextInt();
		
		int result1 = intVal + 10;
		int result2 = intVal - 10;
		
		System.out.println(result1);
		System.out.println(result2);
//		
		// 3-4
		Scanner stdIn2 = new Scanner(System.in);
		System.out.println("정수값을 입력하세요 : ");
		int intval2 = stdIn2.nextInt();
		
		int result3 = intval2 / 10;
		System.out.println("마지막 자리수 제외값 : "+result3);
		int result4 = intval2 % 10;
		System.out.println("마지막 자리수 : "+result4);
//		
//		 3-5 두개의 실수값을 입력받아 합과 평균 구하는 프로그램
		Scanner stdIn1 = new Scanner(System.in);
		System.out.println("실수값을 입력하세요 : ");
		double intVal1 = stdIn1.nextDouble();
				
		Scanner stdIn3 = new Scanner(System.in);
		System.out.println("실수값을 입력하세요 : ");
		double intVal2 = stdIn2.nextDouble();
				
		System.out.println("합 :"+(intVal1 + intVal2));
		System.out.println("평균 : "+(intVal1 + intVal2)/2);
//		
//		 3-6 삼각형의 밑변과 높이를 입력받아 넓이구하는 프로그램
		Scanner stdIn4 = new Scanner(System.in);
		System.out.println("밑변을 입력하세요 : ");
		double base = stdIn1.nextDouble();
				
		Scanner stdIn5 = new Scanner(System.in);
		System.out.println("높이를 입력하세요 : ");
		double height = stdIn2.nextDouble();
		
		System.out.println("삼각형의 넓이 : "+ base*height/2);
		
		//3-7 프로그램 작성
//		한자리 양의 정수값(1~9) 을 랜덤으로 생성해서 표시
		Random rnd = new Random();
		
		System.out.println(rnd.nextInt(10));

//		한자리 음의 정수값을 랜덤으로 생성해서 표시
		
		System.out.println(-rnd.nextInt(1));
		
//		두자리 양의 정수값을 랜덤으로 생성해 표시
		System.out.println(rnd.nextInt(10));

				
	}

}
