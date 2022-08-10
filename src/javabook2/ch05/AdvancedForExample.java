package javabook2.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("합계 : "+sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균 : "+avg);
	}
}
