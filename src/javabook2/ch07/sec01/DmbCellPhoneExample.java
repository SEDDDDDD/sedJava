package javabook2.ch07.sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone myPhone = new DmbCellPhone("DMB-11", "gold", 1);
		DmbCellPhone broPhone = new DmbCellPhone("DMB-12", "pink", 1);
		
//		dmbCellPhone.model = "DMB-11";
		
//		dmbCellPhone.powerOn();
//		
//		dmbCellPhone.powerOff();
//		
//		dmbCellPhone.turnOnDbm();
//		dmbCellPhone.channel = 30;
//		
//		System.out.println(dmbCellPhone.channel);
//		System.out.println(dmbCellPhone.color);
//		dmbCellPhone.changeChannelDmb(11);
//		
//		System.out.println(dmbCellPhone.channel);
//		
//		dmbCellPhone.turnOffDmb();
		
		System.out.println("myphone : "+myPhone.model);
		System.out.println("brophone : "+broPhone.model);
		
		myPhone.powerOn();
		myPhone.bell();
		myPhone.sendVoice("hello");
		myPhone.receiveVoice("is your phone?");
		myPhone.hangUp();
		myPhone.powerOff();
		System.out.println(myPhone.channel);
		
		myPhone.changeChannelDmb(30);
		System.out.println(myPhone.channel);
		
		myPhone.reboot();
		
		
		
		
		
		
		
		
	}

}
