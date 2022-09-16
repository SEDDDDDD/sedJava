package javabook2.ch11.sec03.deepclone;

public class MemberExample {

	public static void main(String[] args) {

		// 원본 객체 확인
		Member original = new Member("홍길동", 20, new int[] {1,2}, new Car("소나타"));
		System.out.println("==========원본 객체===============");
		System.out.println(original.name);
		System.out.println(original.age);
		
		for(int score : original.scores) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		System.out.println(original.scores.length);
		System.out.println(original.car.model);
		
		// 겍체 복제
		Member cloned = original.getMember();
		
		// 복제된 객체 확인
		System.out.println("==========복제 객체===============");
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		
		
		for(int score : cloned.scores) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		System.out.println(cloned.car.model);

		cloned.scores[0] = 100;
		cloned.car.model = "벤츠";
		System.out.println("==========원본 객체===============");
		System.out.println(original.scores[0]);
		System.out.println(original.car.model);
		System.out.println("==========복제 객체===============");
		System.out.println(cloned.scores[0]);
		System.out.println(cloned.car.model);
		
		
	}

}
