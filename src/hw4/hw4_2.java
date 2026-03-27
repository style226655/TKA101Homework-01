package hw4;

public class hw4_2 {
	public static void main (String[] args) {
		String a = "Hello World";
		char[] b = a.toCharArray();
		for(int c = 10; c<=b.length; c--) {
			if(c == -1) {
			break;
			}
			System.out.print(b[c]);	
		}
	}
}
