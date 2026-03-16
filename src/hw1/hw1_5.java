package hw1;

public class hw1_5 {
	public static void main(String[]args) {
		 int bank = 1500000;
		 double bankRate = 1 + (0.02);
		 int year = 10;
		 double result = bank * Math.pow(bankRate,year);
		 System.out.printf("10年後總金額為：" + "%.2f", result);
 	}
}