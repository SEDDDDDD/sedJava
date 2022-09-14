package javabook2.ch10.sec04;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
		String data1 = args[0];
		String data2 = args[1];
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		System.out.println("args[0] : "+data1);
		System.out.println("args[1] : "+data2);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("인수부족");
			System.out.println("인수 두개 입력하세요");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}finally {
			System.out.println("예외 처리 완료");
		}
	}

}
