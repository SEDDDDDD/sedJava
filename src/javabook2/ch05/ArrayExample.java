package javabook2.ch05;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 83;
		int score2 = 81;
		int score3 = 83;
		int score4 = 89;
		int score5 = 87;
		int score6 = 85;
		int score7 = 88;
		int score8 = 95;
		
		
		
//		int[] scoreArray1;  이상태는 초기값이 null 임
		
//		 1. 변수 선언과 동시에 값 목록으로 대입
		int[] scoreArray1 = {83, 81, 83, 89, 87, 85, 88, 95};
		
		int sum = 0;
		
		for (int i=0; i < 8; i++) {
			sum += scoreArray1[i];
		}
		
		int avg = sum / 8;
		System.out.println(sum + "," + avg);
		
//		2. 변수 선언 후 값 목록 대입
		int scoreArray2[] = null;
//		System.out.println(scoreArray2[0]); //nullpointException
		scoreArray2 = new int[] {83, 81, 83, 89, 87, 85, 88, 95};
		System.out.println(scoreArray2[0]);
		System.out.println("길이 : "+scoreArray2.length);
		
		
		// 3. 변수 선언 후 객체 공간만 생성하는 경우
		int[] scoreArray3 = new int[8];
		
		
		boolean[] boolArr1 = new boolean[3];
		boolArr1[1] = true;
		System.out.println(boolArr1[1]);
		
		
		int sum3 = 0;
		for ( int i=0; i<scoreArray2.length; i++) {
			System.out.println(scoreArray2[i]);
			sum3 += scoreArray2[i];
					
		}
		System.out.println(sum3);
	}
}