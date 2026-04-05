package hw5;

public class Work03 {

	public int maxElement(int w[][]) {
		int max=0;
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<w[i].length;j++) {
				if (max<w[i][j]) {
					max=w[i][j];
				}
			}
		}
		return(max);
	}
	public double maxElement(double w[][]) {
		double max=0;
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<w[i].length;j++) {
				if (max<w[i][j]) {
					max=w[i][j];
				}
			}
		}
		return(max);
	}
	
	public static void main(String[]args) {
	int[][] intArray = {
		{1,6,3},
		{9,5,2}
	};
		
	double[][] doubleArray = {
		{1.2,3.5,2.2},
		{7.4,2.1,8.2}
	};
		
	Work03 w = new Work03();
	System.out.println(w.maxElement(intArray));
	System.out.println(w.maxElement(doubleArray));
	}
}
