package Question;

public class Q4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 별 찍기
//		for (int x=1; x<=5; x++) {
//			String chr = "*";
//			System.out.println(chr.repeat(x));
//		}
		
		for (int i = 1; i <=5; i++) {			// 행 번호
			for (int j= 1; j <=i; j++) {		// 별 개수
				System.out.print('*');
				if (i==j) {
					System.out.println();
				}
			}		
		}
	}
}
