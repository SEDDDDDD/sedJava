package Question.ch05;

public class Q5_2 {

	public static void main(String[] args) {
		// 요소개수가 5개인  int 형 배열에 순서대로 5 4 3 2 1 을 대입하는 프로그램을 작성하시오
		
		int[] arr = new int[5];
		int[] temp = {5, 4, 3, 2, 1};
		for(int i =0; i< temp.length;i++) {
			arr[i] = temp[i];
		}
		

	}

}
