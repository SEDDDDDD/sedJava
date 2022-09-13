package javabook2.ch10.sec03;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// 실행 예외 ( RuntimeException ) 처리

		String data1 = null;
		String data2 = null;

		System.out.println("실행 예외 인가요?");

		try {
			data1 = args[0];
			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 실행 시 인수가 부족합니다.");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample [arg1] [arg2]");
		} finally {
			System.out.println("야호");
		}
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);

		// NumberFormatException
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.print("result : ");
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("정수로 바꿀 수 없습니다.");
			System.out.println("다른 인수를 사용하세요");
		} finally {
			System.out.println("오류가 발생하면, 다시 실행하세요");
		}
		
		
	}


	}


