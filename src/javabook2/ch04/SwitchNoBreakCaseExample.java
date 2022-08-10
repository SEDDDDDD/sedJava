package javabook2.ch04;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*24)+1;
		System.out.println("현재시각 : "+time+"시");
		switch (time) {
		case 8:
			System.out.println("등원");
			//break;
		case 9:
			System.out.println("전날수업리뷰");
			//break;
		case 10:
			System.out.println("자바");
			//break;
		case 11:
			System.out.println("자바");
			//break;
		case 12:
			System.out.println("자바");
			//break;
		case 13:
			System.out.println("점심");
			//break;
		case 14:
			System.out.println("머신러닝");
			//break;
		case 15:
			System.out.println("머신러닝");
			//break;
		case 16:
			System.out.println("머신러닝");
			//break;
		case 17:
			System.out.println("하원");
			//break;
		case 18:
			System.out.println("저녁");
//			break;
		case 19:
			System.out.println("복습");
//			break;
		case 20:
			System.out.println("예습");
//			break;
		case 21:
			System.out.println("예습");
//			break;
		case 22:
			System.out.println("잠");
//			break;
		case 23:
			System.out.println("잠");
//			break;
		default:
			System.out.println("잠");
//			break;
			
		}
	}

}
