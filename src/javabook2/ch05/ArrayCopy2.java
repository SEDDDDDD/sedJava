package javabook2.ch05;

import java.util.Arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArr = {1, 2, 3};
		int[] newIntArr = new int[5];
		
		//  system.arraycopy() 메소드 이용
		// arrarycopy( 소스배열, 복사시작위치, 대상배열, 붙혀넣기시작위치, 복사길이)
		
		
		System.arraycopy(oldIntArr, 0, newIntArr, 0, 3);
		
		System.out.println("복사후");
		for (int i=0; i<newIntArr.length; i++) {
		System.out.print(newIntArr[i]);
		System.out.print(" ");
		}
		
		
//		 3. Arrays 클래스 이용
//		copyOf(원본배열, 복사길이)
//		 복사 길이는 원본배열보다 커도 됨, 타겟배열의 크기가 된다
//		newIntArr = Arrays.copyOf(oldIntArr, 5);
//		System.out.println("복사후");
//		for (int i=0; i<newIntArr.length; i++) {
//		System.out.print(newIntArr[i]);
//		System.out.print(" ");
//		}
	}

}
