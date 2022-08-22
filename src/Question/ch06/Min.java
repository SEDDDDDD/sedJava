package Question.ch06;

import java.util.Scanner;

public class Min {
	
	static int min(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		} else if (min > c) {
			min = c;
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
				
		System.out.print("1st Integer 'a' > ");
		int a = stdIn.nextInt();
		System.out.println("2nd Integer 'b' > ");
		int b = stdIn.nextInt();
		System.out.println("3rd Integer 'c' > ");
		int c = stdIn.nextInt();
		
		int result = Min.min(a, b, c);
		System.out.println(result);
	}
}
