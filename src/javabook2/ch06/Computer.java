package javabook2.ch06;

public class Computer {
	
	int sum1(int[] values) {
		int result = 0;
		for(int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
	
	int sum2(int ... values) {
		int result =0;
		for(int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
}
