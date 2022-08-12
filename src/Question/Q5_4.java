package Question;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_4 {

	public static void main(String[] args) {
		// 시험점수의 합계, 평균 ,최고점, 최저점을 구하는 프로글매을 작성하시오
		Scanner stdIn = new Scanner(System.in);
		System.out.print("사람수 입력 >");
		int people = stdIn.nextInt();
		int[] scores = new int[people];
		for (int i=0; i<people;i++) {
			;
			System.out.println("점수를 입력");
			System.out.print((i+1)+"번 점수 : ");
			scores[i] = stdIn.nextInt();
			}
		
		int total = 0;
		for (int score : scores) {
			total += score;
		}
		int min = scores[0];
		int max = scores[0];
		
		// 최고 최저 구하기
//		for (int i=0; i<people; i++) {
//			if (scores[i] < min){
//				min = scores[i];
//			}
//			if (scores[i] > max) {
//				max = scores[i];
//			}
//		}
		
		System.out.println("합계 : "+ total);
				
		double avr = (double)total / scores.length;
		System.out.println("평균 : "+ total);
		
		Arrays.sort(scores);
		System.out.println("최고점 : "+scores[people-1]);
		System.out.println("최저점 : "+scores[0]);
	}

}
