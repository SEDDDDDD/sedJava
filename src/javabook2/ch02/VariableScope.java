package javabook2.ch02;

public class VariableScope {

	public static void main(String[] args) {
		int v1 = 15;
		
		if (v1 > 10) {			// true
			int v2 = v1 - 10;
			
		}
		
		int v3 = v1 + 5;
		
	}

}