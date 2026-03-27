package hw4;

public class hw4_3 {
	public static void main (String[] args) {
		
		String [] star= 
		{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		char letter[]= {'a','e','i','o','u'};
		
		int sum = 0;
		
		for(int a = 0; a<star.length; a++) {
			char[] c = star[a].toCharArray();
				for(int b = 0; b<c.length; b++) {
//				System.out.println(c[b]);
					for(int d=0;d<letter.length;d++)
					if(c[b] == letter[d]) {
					sum++;
//					System.out.println(c[b]);
					}
				}
		}
		System.out.println(sum);
	}
}