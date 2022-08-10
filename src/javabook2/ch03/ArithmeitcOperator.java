package javabook2.ch03;

public class ArithmeitcOperator {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		double result6 = (double)v1 / v2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
		// overflow
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = 'A' + '0';
		char c4 = '0';
//		char c3 = c1 + c2;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println((int)c4);
		
		
		
		
		int x = 1000000;
		int y = 1000000;
		long z = (long)x * y;
		
		System.out.println(z);
		
	
		

	}

}
