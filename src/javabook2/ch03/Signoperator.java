package javabook2.ch03;

public class Signoperator {

	public static void main(String[] args) {
		
		// 부호 연산자
		int x = 100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 ="+ result1);
		System.out.println("result2 ="+ result2);
		
		
		short s = 100;
//		short result3 = -s;
		int result3 = -s;
		System.out.println("result3 ="+ result3);
		
//		증감연산자 ++ --
		int x1 = 10;
		int y1 = 10;
		int z1;
		
//		++ 피연산자 : 다른 연산을 수행하기 전에 먼저 피연산자의 값을 1 증가  
//		-- 피연산자 : 다른 연산을 수행하기 전에 먼저 피연산자의 값을 1 감소
//		피연산자 ++ : 다른연산을 수행한 후에 피연산자의 값을 1 증가
//		피연산자 -- : 다른연산을 수행한 후에 피연산자의 값을 1 감소
		
		++x1;
		System.out.println(x1);
		x1++;
		System.out.println(x1);
		
		++y1;
		System.out.println(y1);
		y1++;
		System.out.println(y1);
		
		z1 = ++x1;
		System.out.println(z1);
		z1 = x1++;
		System.out.println(z1);
		System.out.println(x1);

		
		// 논리 부정 연산자 (!)
		
		boolean light = true;
		light = !light;
		light = !light;
		
		if (light == true) {
			System.out.println(light);
			System.out.println("불이 켜졌습니다.");
		}
		else {
			System.out.println(light);
			System.out.println("불이 꺼졌습니다.");
		}
		
		System.out.println(light);			// true
		
		System.out.println(light);			// false
		
		System.out.println("==============");			
		
		
		
	}

}
