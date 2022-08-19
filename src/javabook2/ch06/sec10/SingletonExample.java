package javabook2.ch06.sec10;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton single = Singleton.getInstance();
		
		single.field = 2;
		single.method();
		
		Singleton single1 = new Singleton();
		Singleton single2 = new Singleton();
		Singleton single3 = new Singleton();
	}

}
