package Question.ch05;

import java.util.Scanner;

public class Q5_3 {

	public static void main(String[] args) {
		// 배열의 요소수와 개별요소의 값을 입력받아서 표시하는 프로그램 작성
//		(다음과같이)
//		실행 예)
//		요소수 : 3
//		a[0]=5
//		a[1]=7
//		a[2]=8
//		a= {5, 7, 8}
		Scanner stdIn = new Scanner(System.in);
		System.out.print("배열의 요소수 입력 >");
		int input = stdIn.nextInt();
		int[] inputArr = new int[input];
		
		for(int i=0; i<inputArr.length; i++) {
			
			System.out.print(i+"번 요소값 입력 >");
			int inputNum = stdIn.nextInt();
			inputArr[i] = inputNum;
		}
		System.out.print("inputArr ={");
		
		for (int i = 0; i<inputArr.length-1; i++) {
			System.out.print(inputArr[i]);
			System.out.print(", ");
		}
		System.out.print(inputArr[inputArr.length-1]+"}");
		
		
//		int[] a = {5, 7, 8};
//		System.out.println("요소수 : "+a.length);
//		for(int i = 0; i<a.length;i++) {
//			System.out.println("a["+i+"]="+a[i]);
//		}
//		System.out.println("a = {"+a[0]+","+a[1]+","+a[2]+"}");
	}

	
}
