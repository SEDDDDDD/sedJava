package Question.ch04;

public class Q4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 에서 3의 배수의 총합 for 문
		
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
