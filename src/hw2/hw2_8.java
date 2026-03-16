package hw2;

public class hw2_8 {
	public static void main (String[] args) {
		int i=0;
		int j=1;
		while(i<9) {
		i++;
			for(j=1;j<=9;j++) {
				System.out.print(i+"*"+j+'\t');
			}
			System.out.println();
		}
	}
}
