package javabook2.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6)+1;
		switch (num) {
		case 0:
			System.out.println(num+"이 나왔습니다.");
			break;
		case 1:
			System.out.println(num+"이 나왔습니다.");
			break;			
		case 2:
			System.out.println(num+"이 나왔습니다.");
			break;		
		case 3:
			System.out.println(num+"이 나왔습니다.");
			break;
		case 4:
			System.out.println(num+"이 나왔습니다.");
			break;
		case 5:
			System.out.println(num+"이 나왔습니다.");
			break;
		default:
			System.out.println("해당되는 답이 없습니다.");
			break;
		}
	}

}
