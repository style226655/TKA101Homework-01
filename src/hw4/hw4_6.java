package hw4;
public class hw4_6 {
public static void main(String[] args) {
	int test[][] = {
			{10,35,40,100,90,85,75,70},
			{47,75,77,89,64,75,70,95},
			{100,70,79,90,75,70,79,90},
			{77,95,70,89,60,75,85,89},
			{98,70,89,90,75,90,89,90},
			{90,80,100,75,50,20,99,75}		
			};
	int[] classMate = {1,2,3,4,5,6,7,8};
	//用來存每個人考幾次高分的陣列
	int[] winCount = new int[8];
	//暫存最高分的紀錄
	int max=0;
	
	again:	
	//先比較出每一場考試最高分的分數是哪一個
	for(int i=0;i<test.length;i++) {
		for(int j=0;j<test[i].length;j++) {
			if(test[i][j]>max) {
			max=test[i][j];
			}
		}
			//再跑一次當次考試的迴圈，只要跟最高分的分數相同，就在該陣列的位置(等同於哪一位同學)加1
			for(int k=0;k<test[i].length;k++) {
				if(test[i][k]==max) {
				winCount[k]=winCount[k]+1;
				}	
			}
		//把上一次比較最高分的結果歸零
		max=0;
	continue again;	
	}
	//印出學號和相對的高分次數
	System.out.print("學生學號：");
	for(int l=0;l<classMate.length;l++){
		System.out.print(classMate[l]+" ");
	}
	System.out.println();
	System.out.print("高分次數：");
	for(int m=0;m<winCount.length;m++) {
		System.out.print(winCount[m]+" ");
	}
	}
}