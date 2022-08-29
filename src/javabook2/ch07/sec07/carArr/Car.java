package javabook2.ch07.sec07.carArr;

public class Car {
//	Tire frontLeftTire = new Tire("앞왼쪽", 6);
//	Tire frontRightTire = new Tire("앞오른쪽", 2);
//	Tire backLeftTire = new Tire("뒤왼쪽", 3);
//	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	
	
	
	int[] problemLocation = new int[5];
	static final int NO_PROBLEM = 0;
	static final int FLAT_TIRE = 1;
	
	
	//메
	// 기능 : 자동차를 주행하다
	// 입력값 : 없음
	// 출력값 : 어떤 바퀴에 문제가 생겼는가
	int[] drive() {
		System.out.println("운전합니다.");
		
		for(int i=1;i<=4;i++) {
		problemLocation[i] = NO_PROBLEM;   // 타이어 문제 배열 초기화(타이어교체 후 다시 0으로 변경)
		
		}
		for(int i =0; i<4; i++) {
			if (tires[i].roll()==false) {
				stop();
				problemLocation[i+1] = FLAT_TIRE; // 특정 위치 펑크
//				return 1;
		}
		}
			
//		if (tires[0].roll()==false) {
//			stop();
//			problemLocation[1] = FLAT_TIRE; // 앞 왼쪽 펑크
////			return 1;
//		}
//		if (tires[1].roll()==false) {
//			stop();
//			problemLocation[2] = FLAT_TIRE; // 앞 오른쪽 펑크
////			return 2;
//		}
//		if(tires[2].roll()==false) {
//			stop();
//			problemLocation[3] = FLAT_TIRE; // 뒤 왼쪽 펑크
////			return 3;
//		}
//		if (tires[3].roll()==false) {
//			stop();
//			problemLocation[4] = FLAT_TIRE; // 뒤 오른쪽 펑크
////			return 4;
//		}
			
			
			
		//디버깅
		for(int k=1;k<=4;k++) {
			System.out.print(problemLocation[k]);
			System.out.print(" ");
		
		}
		System.out.println(" ");
		
		return problemLocation;
	}
	void stop() {
		System.out.println("Stop");
	}
}

