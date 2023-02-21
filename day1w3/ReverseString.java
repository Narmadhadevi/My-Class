package week3.day1w3;

public class ReverseString {

	public static void main(String[] args) {
		String name="Narmadha";
		char[] ch = name.toCharArray();
		System.out.println();
		System.out.println();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
