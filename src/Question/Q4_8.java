package Question;

public class Q4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while (true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("("+num1+","+num2+")");
			if (num1 + num2 == 5) {
				System.out.println("눈의 합의 5인 주사위 : ("+num1+","+num2+")");
				break;
			}
			else {
				continue;
			
			}
		}
		
	}

}
