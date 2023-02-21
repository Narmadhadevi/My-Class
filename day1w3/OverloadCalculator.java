package week3.day1w3;

public class OverloadCalculator {
public void add(int x,int y,int z) {
	System.out.println(x+y+z);
}
public void add(int x,int y) {
	System.out.println(x+y);
}
public void add(double a,int b) {
	System.out.println(a+b);
}
public void add(double a,double b) {
	System.out.println(a+b);
}
public void add() {
	System.out.println("calculator");
}
	public static void main(String[] args) {
		OverloadCalculator obj=new OverloadCalculator();
		obj.add();
		obj.add(1, 2, 3);
		obj.add(4, 5);
		obj.add(7, 9);
		obj.add(465, 678);

	}

}
