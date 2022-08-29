package javabook2.ch07.sec07.carArr;

public class KumhoTire extends Tire {
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	boolean roll() {
		++accumulatedRotation;	// 누적 회전수 1증가
		
//		누적회전수가 최대회전수보다 작으면,
//		타이어의 수명은 줄어들고
//		정상적으로 동작한다.
//		누적회전수가 최대회전수보다 크거나 같다면, 펑크난다
		if (maxRotation > accumulatedRotation) {
			System.out.print(location);
			System.out.print("금호타이어 수명 : ");
			System.out.println((maxRotation -accumulatedRotation)+"회");
			return true;
		} else {
			System.out.print(location);
			System.out.println("금호 타이어펑크 ***");
			return false;
		}
	}
}
