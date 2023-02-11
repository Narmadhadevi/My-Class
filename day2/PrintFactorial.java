package week1.day2;
public class PrintFactorial {
public static void main(String[] args) {
    int fact=1,i;
	for(i=1;i<=5;i++) {
		fact=i*fact;	
	}
	System.out.println("the factorial of 5 is "+fact);
}
}
