package hw4;

import java.util.Scanner;

public class hw4_4 {
	public static void main(String[] args) {
		
		System.out.println("請輸入");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int money[][] = {
			{25,32,8,19,27},
			{2500,800,500,1000,1200}
		};
		int sum = 0;
		System.out.print("員工編號:");
		for (int i = 1; i < money.length; i++) {
			for (int j = 0; j < money[i].length; j++) {
//				System.out.println(money[i][j]);
				if(money[i][j]>a) {
					System.out.print(money[0][j]+" ");
					sum++;
				}
				}
			}
		System.out.println("共 "+sum+" 人!");
		}
		
		
		
		
		
		
		
	}
//}
