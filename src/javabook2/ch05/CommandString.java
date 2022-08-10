package javabook2.ch05;

public class CommandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] strArr = {"100", "200", "true", "안녕", "반가워"};
//		
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
		
		// 커맨드라인으로부터 입력받은 인수
		System.out.println(args[0]);	// 첫번째 인수
		System.out.println(args[1]);	// 두번째 인수
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		
		// ***문자열을 정수 타입으로 변경
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("정수형"+num1);
		System.out.println("정수형"+num2);
		
		String strNum = args[0];
		System.out.println("문자열"+strNum);
	}

}
