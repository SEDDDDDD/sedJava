package javabook2.ch04;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		String grade = stdIn.next();
		
		System.out.println(grade);
		System.out.println(grade.equals("B"));
		
//		switch(grade) {
//		 case "A":
//		 case "a":
//			 System.out.println("성적은 A");
//			break;
//		 case "B":
//		 case "b":
//			 System.out.println("성적은 B");
//			break;
//		 default:
//	}
	}

}
