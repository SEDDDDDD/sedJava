package Question.ch05;

import java.util.Scanner;

public class Q5_7 {

	public static void main(String[] args) {
		// 배열에서 특정 값을 가지는 요소를 찾자
		// 동일값에 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾을것
		// 동일값에 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾을것
		// 실행 예)
//		요소 수 입력 : 7
//		찾을 숫자 입력 : 
//			
//		찾는 숫자는 arry[3]에 있습니다.
				
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수 입력 >");
		int input = stdIn.nextInt();
		
		int[] array = new int[input];
		System.out.println("요소 값 입력");
		
		for (int i=0;i<array.length;i++) {
			System.out.print("arr["+i+"] = ");
			int arrayNum = stdIn.nextInt();
			array[i] = arrayNum;
		}
		
		
		System.out.print("찾을 숫자 입력 : ");
		int findNum = stdIn.nextInt();
		// 앞에 위치한 요소 출력
		int count = 0;
		for (int i=0;i<array.length;i++) {
			
			if (array[i]== findNum) {
//				System.out.print("찾는 숫자 위치 : arr["+i+"]");
				count += 1;
			}
		}
		System.out.println(count);
		int[] idx = new int[count];
		for (int i=0;i<count;i++){
			// 값이 같으면 인덱스에 넣기
			// 다르면 idx[i] 값은 그대로 array[i] 값만 1씩 증가해서   
			if (array[i]== findNum) {
				idx[i] = array[i];
				} 
			} 

	}

}
