package javabook2.ch11.sec03.toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("Apple", "IOS");
		SmartPhone broPhone = new SmartPhone("google", "Andorid");
		
		System.out.println(myPhone.toString());
		System.out.println(broPhone.toString());
		
	}

}
