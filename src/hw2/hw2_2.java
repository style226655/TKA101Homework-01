package hw2;

public class hw2_2 {
	public static void main (String[] args) {
		int i;
		int total = 1;
		for(i = 1;i<=10;i++){
			total=total*i;
		}
		System.out.println("計算1 ~ 10的連乘積：" +total);
	}
}