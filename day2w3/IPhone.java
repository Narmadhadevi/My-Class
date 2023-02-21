package week3.day2w3;

public class IPhone extends Android implements Mobile {

	public static void main(String[] args) {
	IPhone obj=new IPhone();
	obj.sendSMS();
	obj.dailNumber();
	obj.switchON();
	obj.makecall();
	obj.touchPad();
	}

	public void sendSMS() {
		System.out.println("send Sms");
		
	}

	public void dailNumber() {
		System.out.println("dail num");
		
	}

	public void switchON() {
		System.out.println("switch on");
		
	}

	@Override
	public void touchPad() {
		System.out.println("touch pad");
		
		
	}
}
