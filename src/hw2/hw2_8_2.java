package hw2;

public class hw2_8_2 {
	public static void main (String[] args) {
		int i=0;
		int j=1;
		for(j=1;j<=9;j++) {
			i=0;
			do {
				i++;
				System.out.print(j+"*"+i+'\t');
				} while (i < 9);
			System.out.println();
		}
	}
}
