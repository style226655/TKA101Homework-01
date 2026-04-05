package hw5;

public class hw5_2 {
	public static void main(String[]args) {
	hw5_2.randAvg();
		}
	
	//方法keyIn
	public static void randAvg() {
		//產生10個亂數的陣列
		int num[]=new int[10];
		for(int i =0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100);
		}
		//印出10個亂數+存入亂數總和
		int sum = 0;
		System.out.print("本次亂數結果：");
		for(int j =0;j<num.length;j++) {
			System.out.print(num[j] + " ");
			sum=sum+num[j];
		}
	//印出平均數
	System.out.println();
	System.out.print(sum/10);
		}
	}
