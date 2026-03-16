package hw3;

import java.util.Random;
import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int num = rand.nextInt(101);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int num1 = sc.nextInt();
		
		while(num1!=num) {
			System.out.println("猜錯囉");
			if (num!=num && num1<num) {
				System.out.print("大於正確答案");}
			else if (num!=num && num1>num) {
				System.out.print("小於正確答案");}				
			
			num1 = sc.nextInt();
			if(num1==num) {
				System.out.println("答對囉！答案就是"+num);
				break;
				}	
			}
		}
	}	