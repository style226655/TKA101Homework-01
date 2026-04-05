package hw6;

public class Calculator {
public int x;
public int y;

public Calculator() {}

//powerXY功能
public void powerXY(int x,int y) throws Exception{
	//使用者輸入＋回傳錯誤訊息＋回傳次方結果
	
	if(x==0&&y==00) {
		throw new CalException("0的0次方沒有意義！");
		
//		throw new Exception("0的0次方沒有意義！");
	}
	else if(y<0) {
		throw new CalException("次方為負值，結果回傳不為整數！");
	}
	int z = (int) Math.pow(x, y);
	System.out.println(x + "的" + y + "次方等於" + z);
	
}
}