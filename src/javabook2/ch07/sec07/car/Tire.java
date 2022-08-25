package javabook2.ch07.sec07.car;

public class Tire {
	//필
	String location;	// 타이어 장착위치
	int maxRotation;	// 타이어 수명
	int accumulatedRotation;	// 누적회전수
	//생
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메
	
	boolean roll() {
		++accumulatedRotation;	// 누적 회전수 1증가
		
//		누적회전수가 최대회전수보다 작으면,
//		타이어의 수명은 줄어들고
//		정상적으로 동작한다.
//		누적회전수가 최대회전수보다 크거나 같다면, 펑크난다
		if (maxRotation > accumulatedRotation) {
			System.out.print(location);
			System.out.print(" tire life : ");
			System.out.println((maxRotation -accumulatedRotation));
			return true;
		} else {
			System.out.print(location);
			System.out.println(" Tire punk");
			return false;
		}
	}
}
