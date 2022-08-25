package javabook2.ch07.sec07.car;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		for(int i=0;i<10;i++) {
			int problemLocation = myCar.drive();
			
//			타이어 펑크 위치에 따라서 해당위치의 타이어를 교체
//			만약 앞 왼쪽 타이어가 펑크라면 교체
			switch(problemLocation) {
			case 1:
				System.out.println("왼앞 타이어 펑크");
				myCar.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("왼오 타이어 펑크");
				myCar.frontRightTire = new HankookTire("앞오른쪽", 15);
				break;
			case 3:
				System.out.println("뒤왼 타이어 펑크");
				myCar.backLeftTire = new KumhoTire("뒤왼쪽", 300);
				break;
			case 4:
				System.out.println("뒤오 타이어 펑크");
				myCar.backRightTire = new KumhoTire("뒤오른쪽", 300);
				break;
				}
			
			System.out.println("============================");
		}

		
	}

}
