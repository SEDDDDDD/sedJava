package javabook2.ch04;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "차장";
		switch (position) {
		case "사원" :
			System.out.println("300만원");
			break;
		case "대리" :
			System.out.println("400만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		case "차장" :
			System.out.println("600만원");
			break;
		case "부장" :
			System.out.println("700만원");
			break;
		default:
			System.out.println("1000만원");
			break;
			
		}
	}

}
