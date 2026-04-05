package hw5;

import java.util.Scanner;

public class hw5_1 {
	//呼叫keyIn方法
	public static void main(String[]args) {
	hw5_1.starSquare();
	}
	//方法keyIn
	public static void starSquare() {
		System.out.println("請輸入寬度和高度：");
		Scanner sc = new Scanner(System.in);
		int weigth = sc.nextInt();
		int heigth = sc.nextInt();
		//變數存進陣列，印出*
		int wh[][] = new int[weigth][heigth];
		for(int i=0;i<heigth;i++) {
			for(int j=0;j<weigth;j++) 
			System.out.print("*");
			System.out.println();
		}
	}
}