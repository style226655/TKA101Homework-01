package hw5;

public class MyRectangle {
	//給兩個double型態的屬性width, depth
	public double width;
	public double depth;
	
	//方法一：收到的引述指定給width屬性
	public void setWidth(double width) {
	this.width = width;
	}
	//方法二：收到的引述指定給depth屬性
	public void setdepth(double depth) {
	this.depth = depth;	
	}
	//方法三：計算長方形的面積
	public void getArea() {
		System.out.println(width*depth);
		
	}
	//建構子一：不帶參數也無內容的建構子
	public MyRectangle () {}
	//建構子二：傳入的兩個引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	//main方法
	public static void main(String[]args) {
		//1. 使用public MyRectangle()建構子建立物件
		MyRectangle r = new MyRectangle(10,20);
		r.getArea();
	
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(10);
		r1.setdepth(20);
		r1.getArea();
		
	}
}
//使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
//• 請另外建立一個MyRectangleMain類別,此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果