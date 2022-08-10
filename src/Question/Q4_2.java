package Question;

public class Q4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한국어 사이트 , 영문 사이트
		//달력의 월이 한글로 작성이 되어있다.
		//월을 영어로 변경해서 출력
		
		// 한글 1 영어 0
		int lang = 0;
//		
		int month = (int)(Math.random()*12)+1;
		
		if (lang==1) {
			switch (month) {
				case 1:
					System.out.println("January");
					break;
				case 2:
					System.out.println("Febrary");
					break;
				case 3:
					System.out.println("March");
					break;
				case 4:
					System.out.println("April");
					break;
				case 5:
					System.out.println("May");
					break;
				case 6:
					System.out.println("June");
					break;
				case 7:
					System.out.println("July");
					break;
				case 8:
					System.out.println("August");
					break;
				case 9:
					System.out.println("September");
					break;
				case 10:
					System.out.println("October");
					break;
				case 11:
					System.out.println("November");
					break;
				case 12:
					System.out.println("December");
					}
				}
			else {
				System.out.println(month+"월");
				}
		}
	}



