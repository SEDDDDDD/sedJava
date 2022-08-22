package Question.ch06;

import java.util.Scanner;

public class PrintSeason {
//	인수에 특정 월(달)을 입력받아 계절을 표시하는
//	printSeason 메서드 작성
//	인수 값에따라 봄, 여름, 가을 ,겨울 표시하고
//	그 이외의 값이 오면 아무것도 표시하지 않는다.
		static String printSeason(int input){
			String season = null;
			switch(input) {
			case 12:
			case 1:
			case 2:
				season = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Fall";
				break;
			default:
				season = "";
				break;
			}
			return season;
		}
		
			
//			if(input == 3 || input ==4 || input ==5) {
//				return "Spring";
//			} else if (input == 6 || input == 7 || input == 8) {
//				return "Summer";
//			} else if (input == 9 || input == 10 || input == 11) {
//				return "Autumm";
//			} else if (input == 12 || input == 1 || input == 2) {
//				return "Winter";
//			} 
//			return "";
//		}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Input Month > ");
		int month = stdIn.nextInt(); 
		System.out.println(printSeason(month));
	}

}
