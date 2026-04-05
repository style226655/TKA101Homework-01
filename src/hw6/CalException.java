package hw6;
//繼承 Exception
public class CalException extends Exception{
	//建構子：用來接收錯誤訊息的字(msg)
	public CalException(String msg) {
		//把字串交給父類別(Exception 類別)
		super(msg);
	}
}