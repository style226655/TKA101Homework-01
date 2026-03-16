package hw3;

import java.util.Scanner;

public class hw3_3 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字？");
		
		//讓使用者先輸入一個數字
		Scanner sc = new Scanner(System.in);
		//輸入提示字
		System.out.println("input");
		int hateNum = sc.nextInt();
		
		//設定陣列要6個值，把亂數生成的數字，放進陣列裡
		int newNum[] = new int[6];	//設定k是陣列值的址的變數
		
		outer:	
		for (int k = 0; k < newNum.length; k++) {								
		newNum[k] = (int)(Math.random()*49) +1; //產生亂數，抽籤放入
			
			//第一關，檢查有沒有阿文不喜歡的數字
			//將亂數的陣列一個一個比較是否有阿文不喜歡的數字
			if ( newNum[k] / 10 == hateNum || newNum[k] % 10 == hateNum ) {
//如果符合條件，就將陣列的址(變數)減1，目的是當迴圈跑完後會加1，但我們想要符合此條件的話，重新產生亂數並放在同一個陣列的值裡
			k--; 
			continue outer; //跳到outer標籤的地方，重新執行產生亂數放入陣列
			}

		// 第二關：檢查變數是否有重複（活著到這裡的數字，保證絕對沒阿文不喜歡的數字）
	    // 我們先把n作為要檢查陣列值的變數
		int n = 0;
		for(n=0;n<k;n++) {
			//k=陣列第0個址，n=比對陣列址
			//如果0址比對不等於0址，繼續迴圈，
			//如果1址比對等於0址，會到continue跳到outer標籤，重新生成亂數放進陣列裡，
			//為了下一次的比對要重新開始，所以要把k--，因為跑完迴圈的時候會+1
			if (newNum[k] == newNum[n]) {
			k--;
			continue outer;
			}
			
			}
		}
//		都完成之後再印出亂數陣列表
		for(int o=0;o<newNum.length; o++) {
		System.out.print(newNum[o]+"\t");
		}
		System.out.println();
//		都完成之後再印出亂數陣列表
				
						
		int i;
		int j=0;
		
		for(i=1;i<=49;i++) {
			if(hateNum==(i/10) && hateNum==(i%10)) {
			}
			else if(hateNum!=(i/10) && hateNum!=(i%10)){
				j++;
				System.out.print(i+"\t");
					if(j%6==0) {
						System.out.println();
						}
			}	
		}
		System.out.println("總共有"+j+"數字可選");
	}
}
