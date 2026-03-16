package hw2;

public class hw2_8_3 {
	public static void main (String[] args) {
		int i=0;
		int j=1;
			while (i < 9){
				i++;
				j=0;
				do {
					j++;
					System.out.print(i+"*"+j+'\t');
					}
				while(j < 9);	
				System.out.println();
			}
	}
}