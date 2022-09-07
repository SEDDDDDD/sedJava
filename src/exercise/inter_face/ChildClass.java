package exercise.inter_face;

public class ChildClass implements ChildInterface{
	ChildInterface ci1 = new ChildInterface() {
		@Override
		public void methodA() {
			System.out.println("methodA 흐하흐하");
		}
		@Override
		public void methodC() {
			System.out.println("methodC 흐하흐ㅏ");
		}
	};
}
