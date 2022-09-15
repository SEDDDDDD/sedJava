package Question.test;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		Alram alram = sp;
		Phone phone = sp;
		Messenger messenger = sp;
		
		alram.playMusic("happy things");
		alram.beep();
		
		phone.makeCall("010-1234-5678");
		phone.receiveCall();
		
		messenger.sendMsg("010-1234-5678", "누구임");
		messenger.receiveMsg();
		
		
	}

}
