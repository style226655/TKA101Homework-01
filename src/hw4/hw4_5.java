package hw4;
import java.util.Scanner;
public class hw4_5 {

	public static void main(String[] args) {
	//不是閏月的總月天數
	int [][] normal = {
			{1,2,3,4,5,6,7,8,9,10,11,12},
			{31,28,31,30,31,30,31,31,30,31,30,31}
	};
	//是閏月的總月天數
	int [][] noNormal = {
		{1,2,3,4,5,6,7,8,9,10,11,12},
		{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	//	儲存天數和月份
	int day = 0;
	int month = 0;
				
	System.out.println("請輸入年份");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

	System.out.println("請輸入月份");
	int b = sc.nextInt();
	
	//檢查是否大於12，不對就輸入直到正確為止
	for(;b>12;) {
			System.out.println("不可大於12月");
			System.out.println("請重新輸入月份");
			b=sc.nextInt();
		}
	//檢查是否大於31，和2月是否大於29，不對就輸入直到正確為止
	System.out.println("請輸入日期");
	int c = sc.nextInt();
		for(;c>31;) {
			System.out.println("月份不可大於31日");
			System.out.println("請重新輸入日期");
			c=sc.nextInt();
		}
		for(;b==2&&c>29;) {
					System.out.println("2月不可大於29日");
					System.out.println("請重新輸入日期");
					c=sc.nextInt();
			}
		
		
		//檢查是否是閏年
		if((a % 100 == 0 && a % 400 == 0) || (a % 4 == 0 && a %100 != 0)) {
			out:
				//先用第0行陣列逐一比對有沒有大於輸入的月份
				for(int i = 0; i<noNormal[0].length;i++) {
				//因為陣列開頭為0，所以要加1
				month=month+1;
				//如果月份小於輸入的月份，把第1行陣列的日期存入day變數裡
				if(month<b){
					day+=noNormal[1][i];
					continue out;
				}
			}
			//日期已加總到使用者輸入月份，前一個月的日期了，再加上使用者輸入的天數
			System.out.println("輸入的日期為該年第"+(day+c)+"天");
		}		
		

		//檢查是否是平年
		else {
			out1:
				for(int i = 0; i<normal[0].length;i++) {
					month=month+1;
					if(month<b){
					day+=normal[1][i];
					continue out1;
					}
				}
			//平年時使用者不該輸入2月的日期為29，要求重新輸入直至正確
			for(;b==2&&c==29;) {
				System.out.println("平年2月不可等於29日");
				System.out.println("請重新輸入日期");
				c=sc.nextInt();
					if(b==2&&c<=28){
						System.out.println("輸入的日期為該年第"+(day+c)+"天");
					}
			}
		}
	}
}
