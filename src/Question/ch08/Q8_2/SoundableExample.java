package Question.ch08.Q8_2;
// SoundableExample 클래스에서 printSound() 메소드는 Soudable 인터페이스 타입의 매개 변수를 가지고있습니다.
// main()메소드에서 printSound() 를 호출 할 때 Cat 과 Dog 객체를 주고 실행하면
// 각각 야옹 과 멍멍 이 출력 되도록 cat과 dog 클래스를 작성하시오
public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printSound(new Cat());
		printSound(new Dog());
		
	}

}
