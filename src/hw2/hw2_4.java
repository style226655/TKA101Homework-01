package hw2;

public class hw2_4 {
	public static void main (String[] args) {
		int i = 1;
		int j = 1;
		for(i = 1;i <= 100;i = i + (j = j + 2))
			System.out.println(i);	
	}
}
