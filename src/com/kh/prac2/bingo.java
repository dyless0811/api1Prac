import java.util.Scanner;

public class bingo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("빙고판 크기: ");
		int size = sc.nextInt();
		
		int[] RandomArr = new int[size*size];
		
		for(int i = 0; i < RandomArr.length; i++) {
			RandomArr[i] = (int)(Math.random()*(size*size)+1);
			for(int j=0; j < i; j++) {
				if(RandomArr[i] == RandomArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] Arr = new int[size][size];
		int index = 0;
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				Arr[i][j] = RandomArr[index++];
			}
		}
		
		System.out.println("==========빙고게임시작==========");
		for(int i=0; i < Arr.length; i++) {
			for(int j=0; j < Arr[i].length; j++) {
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int cnum = sc.nextInt();
			
			for(int i=0; i < Arr.length; i++) {
				for(int j=0; j < Arr[i].length; j++) {
					if(Arr[i][j] == cnum) {
						Arr[i][j] = 0;
					}
					System.out.print(Arr[i][j]+"\t");
				}
				System.out.println();
			}	
			
//			boolean flag = false;
//			for(int i=0; i < Arr.length; i++) {
//				for(int j=0; j < Arr[i].length; j++) {
//					if(Arr[i][j] != 0) {
//						flag = true;
//					}
//				}
//			}
//			if(flag == false) {
//				break;
//			}
			
			int bingo = 0, lcross = 0, rcross = 0;
			
			for(int i=0; i < Arr.length; i++) {
				int row = 0, col = 0;
				for(int j=0; j < Arr[i].length; j++) {
					if(Arr[i][j] == 0) {
						row++;
					}
					if(Arr[j][i] == 0) {
						col++;
					}
					if(i == j && Arr[i][j] == 0) {
						lcross++;
					}
					if(i+j == size-1 && Arr[i][j] == 0) {
						rcross++;
					}
				}
				if(row == size) {
					bingo++;
				}
				if(col == size) {
					bingo++;
				}
			}
			if(lcross == size) {
				bingo++;
			}
			if(rcross == size) {
				bingo++;
			}	
			
			if(bingo >= 3) {
				break;
			}
			
		}
		System.out.println("빙고 완성");
		
		
	}
}
