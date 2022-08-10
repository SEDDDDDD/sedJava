package javabook2.ch04;



public class WhileKeyControl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 키보드 입력을 통해 while 문 제어
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// 메뉴구성
			// 만약, enter 키가 입력되면 이 값을 출력하지 마세요
			// enter 키 -> 캐리지 리턴(커서를 맨앞으로 이동) / 라인피드(다음줄로 이동)
			
			if (keyCode!=13 && keyCode!=10) {
				System.out.println("1 : 속도증가 | 2 : 속도 감수 | 3 : 중지");
				System.out.println("값을 입력하세요");
			}
			keyCode = System.in.read();	//키보드 키 입력을 읽음

			
			// 만약, 키를 읽었는데 1 읽은 경우
			if (keyCode == 49) {
				speed++;	
				System.out.println("현재속도 : "+speed);
			}			
			// 만약, 키를 읽었는데 2 읽은 경우
			if (keyCode == 50) {
				speed--;
				System.out.println("현재속도 : "+speed);
			}
			// 만약, 키를 읽었는데 3 읽은 경우
			if (keyCode == 51) {
				run = false;		// 반복문 종료 조건	
			}
			
			
		}
		
		System.out.println("프로그램 종료");
	}

}
