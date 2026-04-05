package hw5;

public class hw5_5 {
	
	public static void getAuthCode() {
	
	String[] random = new String[8]; 
	String[][] num = {
			{"0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5"},
			{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
			{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}
			};
	//預先設定一開始的布林值
	boolean number = false;
	boolean up = false;
	boolean low = false;

	//當number,up,low其中一個是false時重複執行迴圈
	while(number==false||up==false||low==false) {
		//恢復預設布林值為false
		number = false;
		up = false;
		low = false;
		int r1;
		int r2;
		//迴圈跑8次取得8位數驗證碼
		for(int i=0;i<8;i++) {
			r1 =(int) ((Math.random() * 3) + 0);
			r2 =(int) ((Math.random() * 26) + 0);
			random[i] = num[r1][r2];
			//檢查驗證碼是否符合數字，英文大寫，英文小寫都有的組合
			if(r1==0) {number=true;}
			else if(r1==1) {up=true;}
			else if(r1==2) {low=true;}
		}
	}
		//印出驗證碼字串
		for(int k=0;k<random.length;k++) {
		System.out.print(random[k]);
		}
	}
	//呼叫getAuthCode方法，印出程式碼
	public static void main(String[]args) { 
		getAuthCode();
	}
}
