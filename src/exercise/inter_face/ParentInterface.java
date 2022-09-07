package exercise.inter_face;

public interface ParentInterface {
	public void methodA();
	public default void methodB() {
		System.out.println("methodB");
	}
}
