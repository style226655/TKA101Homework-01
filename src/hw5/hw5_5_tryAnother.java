package hw5;

public class hw5_5_tryAnother {
	
	public static void randAvg() {
	String[] random = new String[8]; 
	String[] num = {"0","1","2","3","4","5","6","7","8","9"};
	String[] up = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	String[] low = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	random[0] = num[(int) ((Math.random() * 10) + 0)];
	random[1] = up[(int) ((Math.random() * 26) + 0)];
	random[2] = low[(int) ((Math.random() * 26) + 0)];
	
	for(int i=3;i<8;i++) {
		int a = (int) ((Math.random() * 3) + 0);
		if(a==0) {random[i] = num[(int) ((Math.random() * 10) + 0)];}
		else if(a==1) {random[i] = up[(int) ((Math.random() * 26) + 0)];}
		else if(a==2) {random[i] = low[(int) ((Math.random() * 26) + 0)];}
	}
	//依序取出亂數驗證碼迴圈裡的位置
	for(int k=0;k<random.length;k++) {
		//隨機抽出亂數驗證碼的其中一個，因為要打亂順序
		int a=(int) ((Math.random() * random.length) + 0);
		//因為要覆蓋掉資料(假設是random[0])，為了避免資料消失，所以要先存起來
		String temp =random[k];
		//將依序取出亂數驗證碼位置(假設是random[0])的資料，覆蓋為隨機抽出亂數驗證碼位置的資料(假設是random[2])
		random[k]=random[a];
		//被覆蓋掉的驗證碼位置(假設是random[2])，已經是random[0]，所以random[2]的位置，所以可以把原先要被覆蓋的資料放進去
		random[a]=temp;
		//這段迴圈目的是不讓被換掉的資料消失，而是互換位置的概念
	}
	for(int j=0;j<random.length;j++) {
		System.out.print(random[j]);
	}
	}
	
	public static void main(String[]args) {
		randAvg();
	}
	
}
