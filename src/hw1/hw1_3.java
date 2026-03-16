package hw1;

public class hw1_3 {
	public static void main(String[]args) {
		int targetSec = 256559;
		int daySec = 86400;
		int hrSec = 3600;
		int minSec = 60;
		
		int day = targetSec / daySec;
		int dayLeftSec = day * daySec;
		
		int hr = (targetSec - dayLeftSec) / hrSec;
		int hrLeftSec = (hr * hrSec) + dayLeftSec;
		
		int min = (targetSec - hrLeftSec) / minSec;
		int minLeftSec = (min * minSec) + hrLeftSec;
		
		int sec = (targetSec - minLeftSec);
		
		System.out.println
			(day + "天 " + hr + "小時 " + min + "分 " + sec + "秒 ");
		
		
		
		
		
		
		
	}
}
