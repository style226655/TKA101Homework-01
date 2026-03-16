package hw2;

public class hw2_1 {
	public static void main (String[] args) {
		int i;
		int sum = 0;
		for(i=2;i<=1000;i=i+2) {
			sum=sum+i;
		}
		System.out.println("計算1 ~ 1000的偶數和：" + sum);	
	}
}
