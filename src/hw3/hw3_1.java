package hw3;

import java.util.Scanner;

public class hw3_1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input");
	int data1 = sc.nextInt();
	int data2 = sc.nextInt();
	int data3 = sc.nextInt();
	if
	(data1==data2 && data2==data3 && data3==data1 && data1+data2+data3!=0) {
		System.out.println("正三角形");
	}else if
	((data1==data2 || data1==data3 || data2==data3) && data1+data2+data3!=0){
		System.out.println("等腰三角形");
	}
	else if
	(data1==0 && data2==0 && data3==0) {
		System.out.println("不是三角形");
	}
	else if
	((Math.pow(data1,2)+Math.pow(data2, 2)==Math.pow(data3,2))&& data1+data2+data3!=0) {	
		System.out.println("直角三角形");
	}
	else 
		System.out.println("其他三角形");

	}
}
