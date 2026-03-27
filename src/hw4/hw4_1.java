package hw4;

public class hw4_1 {
	public static void main (String[] args) {
		int array[] = {29,100,39,41,50,8,66,77,95,15}; 
		int sum = 0;
		int avg = 0;
		int sum1 = 0;
		for(int b=0; b<array.length; b++) {
			sum = (sum+array[b]);
		}
		avg = sum/10;
		System.out.println("陣列的平均值：" + avg);
		System.out.print("大於平均值：");
		
		for(int b=0; b<array.length; b++) {
			if(array[b]>avg){
				System.out.print(array[b]+" ");
			}
			
		}
		
	}
}
