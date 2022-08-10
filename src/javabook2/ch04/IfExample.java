package javabook2.ch04;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =83;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A");
		} else if (score>=80) {
			System.out.println("등급은 B");
		} else if (score>=70) {
			System.out.println("등급은 C");
		}
		
		else {
			System.out.println("등급은 F");
			
		}
	}

}
