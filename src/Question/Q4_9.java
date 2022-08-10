package Question;

public class Q4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4x + 5y = 60 모든해
		for (int x=1; 0<x && x<=10; x++) {
			for (int y=1; 0<y && y<=10; y++) {
				if (4*x + 5*y == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
