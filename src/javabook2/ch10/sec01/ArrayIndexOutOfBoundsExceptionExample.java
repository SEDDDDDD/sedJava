package javabook2.ch10.sec01;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : "+data1);
		System.out.println("args[1] : "+data2);
		
		String[] strArr = new String[3];
		strArr[0]="kenneth";
		strArr[1]="1234";
		System.out.println("strArr[0] :"+strArr[0]);
		System.out.println("strArr[1] :"+strArr[1]);
		System.out.println("strArr[2] :"+strArr[2]);
		
		strArr[3]="hello";
	}

}
