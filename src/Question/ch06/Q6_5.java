package Question.ch06;

import java.util.Scanner;

public class Q6_5 {

	
	
	static int sumNumber(int input) {
		int result= 0;
		for(int i=1;i<=input;i++) {
			result += i;
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Input Number > ");
		int input = stdIn.nextInt();
		int result = Q6_5.sumNumber(input);
		System.out.println("sum(1~"+input+") : "+result);
	}

}
