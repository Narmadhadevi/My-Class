package week3.day1w3;

public class SmartPhone extends AndroidPhone {
public void connectWA() {
	System.out.println("Connecting to my whatsApp");
}
	public static void main(String[] args) {
		SmartPhone obj=new SmartPhone();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		obj.takeVideo();
		obj.connectWA();

	}

}
