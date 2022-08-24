package Question.ch04;
import java.util.Random;
public class Q4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주사위를 굴려서 나올수 있는 수 [1, 2, 3, 4, 5 ,6] 중에서
		// 하나를 뽑아서 출력
		int rand = (int)(6*Math.random())+1;
		
		if (rand == 1) {
			System.out.println("주사위가 1입니다.");
		} else if (rand==2) {
			System.out.println("주사위가 2입니다.");
		} else if (rand==3) {
			System.out.println("주사위가 3입니다.");
		} else if (rand==4) {
			System.out.println("주사위가 4입니다.");
		} else if (rand==5) {
			System.out.println("주사위가 5입니다.");
		} else {
			System.out.println("주사위가 6입니다.");
		}
//		
//		
		Random rand1 = new Random();
		int dice = rand1.nextInt();
//				
		
		
		
	}

}
