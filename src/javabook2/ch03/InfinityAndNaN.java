package javabook2.ch03;

public class InfinityAndNaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 5;
		 double y = 0.0;
		 
		 double z1 = x / y;
		 double z2 = x % y;
		 
		 double result1 = z1 + 1;
		 double result2 = z2 + 1;
		 
		 Double.isInfinite(result1);
		 Double.isNaN(result2);
		 
		 System.out.println(z1);
		 System.out.println(z2);
		 System.out.println(result1);
		 System.out.println(result2);
		 
		 if (Double.isInfinite(result1)) {
			 System.out.println("연산 수행 불가능! : Infinie");
			 
		 } else {
			 System.out.println(result1);
		 }
		 if (Double.isNaN(result2)) {
			 System.out.println("연산 수행이 불가능 : NaN");
		 } else {
			 System.out.println(result2);
		 }
		 
		 // 한쪽 피연산자가 문자열인 경우, 다른 피연산자를 문자열로 변환 후 결합한다
		 // 연산 우선 순위에 따라 왼쪽 부터 연산 수행
		 String str1 = "JDK" + 1.8;
		 String str2 = str1 + "버전";
		 String str3 = "JDK"+5 + 1.8;
		 
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println(str3);
	}

}
