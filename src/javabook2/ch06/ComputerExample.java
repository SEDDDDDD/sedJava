package javabook2.ch06;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		int[] values1 = {1, 2, 3};
		
		int result = com.sum1(values1);
		System.out.println(result);
		
		int[] values2;
//		values2 = new int[] {1, 2, 3, 4, 5};
		
		int result4 = com.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println(result4);
		
		
		int result2 = com.sum2(1,2,3);
		System.out.println(result2);
		
		int result3 = com.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		
	}

}
