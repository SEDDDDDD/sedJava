package javabook2.ch11.sec05;

public class Exit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			if (i==5) {
				System.exit(i);  // 예외 발생
			}
		}
	}

}
