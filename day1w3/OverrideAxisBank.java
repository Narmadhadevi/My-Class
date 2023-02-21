package week3.day1w3;

public class OverrideAxisBank extends OverrideBankInfo {
public void deposite(){
	System.out.println("deposite");
}
	public static void main(String[] args) {
	OverrideAxisBank obj=new OverrideAxisBank();
	obj.deposite();
	obj.fixed();
	obj.saving();

	}

}
