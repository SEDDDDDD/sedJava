package javabook2.ch11.sec05;

public class ExitExample {

	public static void main(String[] args) {

		
		// 보안관리자
		System.setSecurityManager(new SecurityManager(){

			@Override
			public void checkExit(int status) {
				if (status!=5) {
					throw new SecurityException();		// 예외발생
				}
			}
		});
		
		// 종료상태가 5인 경우 프로세스를 종료
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				System.exit(i);	//예외발생하면 프로그램 종료하지 못하도록
			} catch(SecurityException e) {
				System.out.println(i);
			}
					
		}
		
	}

}
