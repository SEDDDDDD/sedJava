package javabook2.ch05;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] oldIntArr = {1, 2, 3};
		int[] newIntArr = new int[5];
		System.out.println("복사전");
		for (int i=0; i<newIntArr.length; i++) {
			System.out.println(newIntArr[i]);
			}
		
		
		for ( int i=0; i<oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		System.out.println("복사후");
		for (int i=0; i<newIntArr.length; i++) {
		System.out.println(newIntArr[i]);
		}
	}

}
