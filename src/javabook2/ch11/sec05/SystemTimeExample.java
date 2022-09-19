package javabook2.ch11.sec05;

public class SystemTimeExample {

	public static void main(String[] args) {
		// 프로그램 안에서 동작되는 코드의 소요시간 체크
		long time1 = System.currentTimeMillis();
		long time3 = System.nanoTime();
		
		int sum = 0;
		
		//1부터증가하면서 100만까지의 합
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		long time2 =System.currentTimeMillis();
		long time4 = System.nanoTime();
	System.out.println(sum);
	System.out.println(time2-time1+"ms");
	System.out.println(time4-time3+"ns");
	}

}
