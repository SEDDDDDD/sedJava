package javabook2.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		label: while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break label;				
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
