package javabook2.ch05;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = null;
		strVal1 = "유재석";
		// null 값으로 초기화한 클래스객체에 값을 사용하는 경우
		System.out.println(strVal1.length());
		
		
		
		String strval2 = "유재석";
		// null 값으로 초기화한 배열 객체에 값을 할당하는 경우		
		int[] intArray = null;
		
		intArray = new int[]{3, 4, 6};
		System.out.println(intArray);
		
		
	}

}
