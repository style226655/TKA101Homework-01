package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[]args) {
		boolean isOk = false;
		
		while(isOk == false) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值");
		int x = sc.nextInt();
		System.out.println("請輸入y的值");
		int y = sc.nextInt();
		Calculator a = new Calculator();
		try {
			a.powerXY(x,y);
			isOk=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			isOk=false;
		}
		
		}
	}
}	