package javabook2.ch02;

public class Casting {

	public static void main(String[] args) {

		// 강제 형변환 
		// int <-> char
		
		int intVal = 44032;
		
		System.out.println(intVal);
		
		char charVal = (char)intVal;
		
		
		System.out.println(charVal);
		
		// int(4) <- long(8)
		
		long longVal = 100;
		intVal = (int)longVal;
		
		System.out.println(intVal);
		
		double doubleVal = 3.1415;
		intVal = (int)doubleVal;
		System.out.println(intVal);
		
		
		
	}

}
