package javabook2.ch04;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*100)+0;
		
		// 90점 이상이면 A 80 점이상이면 B 70점 C 60점 D 50점 F
		// 95저 이상 A+ 85점 이상 B+ 75점 C+ 65점 D+
		String grade;
		
		if (score >=90) {
			if (score >=95) {
				System.out.println("A+");
				grade = "A+";
			} else {
				System.out.println("A");
				grade = "A";
			}
		} else if (score >=80) {
			if (score >=85) {
				System.out.println("B+");
				grade = "B+";
			} else {
				System.out.println("B");
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+");
				grade = "C+";
			} else {
				System.out.println("C");
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+");
				grade = "D+";
			} else {
				System.out.println("D");
				grade = "D";
			}
		} else {
			System.out.println("F");
			grade = "F";
		}
		System.out.println("최종 학점 : "+ grade);
		
	}

}
