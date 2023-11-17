package two_dimensional_array;

import java.util.Scanner;

public class Two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二维数组
//		
//		//二维数组初始化：
//		int[][] a = new int[3][5];
//		a[0][1] = 6;
//		
//		int[][] b = {{1,2,3,4},{1,2,3},};
//		//编译器来数数
//		//每行一个{}，逗号分隔
//		//最后的逗号可以存在，有古老的传统
//		//如果省略，表示补零
		
		
		//二维数组的例子：tic-tac-toe游戏（井字棋游戏）
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		//读入矩阵		
		for ( int i=0; i<board.length; i++ ) {
			for ( int j=0; j<board[i].length; j++ ) {
				board[i][j] = in.nextInt();
			}
		}
		
		//检查行
		for ( int i=0; i<board.length; i++ ) {
			numOfX = 0;
			numOfO = 0;
			for ( int j=0; j<board[i].length; j++ ) {
				if ( board[i][j] == 1 ) {
					numOfX++;
				}
				else if ( board[i][j] == 0 ) {
					numOfO++;
				}
			}
			if ( numOfX==3 || numOfO==3 ) {
				gotResult = true;
				break;
			}
		}
		
		//检查列
		if ( gotResult == false ) {
			for ( int j=0; j<SIZE; j++ ) {
				numOfX = 0;
				numOfO = 0;
				for ( int i=0; i<board.length; i++ ) {
					if ( board[i][j] == 1 ) {
						numOfX++;
					}
					else if ( board[i][j] == 0 ) {
						numOfO++;
					}
				}
				if ( numOfX==3 || numOfO==3 ) {
					gotResult = true;
					break;
				}		
			}
		}
		
		//检查对角线
		if ( gotResult == false ) {
			numOfX = 0;
			numOfO = 0;
			for ( int i=0; i<board.length; i++ ) {
				if ( board[i][i] == 1 ) {
					numOfX++;
				}
				else if ( board[i][i] == 0 ) {
					numOfO++;
				}
			}
			if ( numOfX==3 || numOfO==3 ) {
				gotResult = true;
			}
		}
		
		//检查反对角线
		if ( gotResult == false ) {
			numOfX = 0;
			numOfO = 0;
			for ( int i=0, j=board[i].length-1; i<board.length; i++, j-- ) {
				if ( board[i][j] == 1 ) {
					numOfX++;
				}
				else if ( board[i][j] == 0 ) {
					numOfO++;
				}		
			}
			if ( numOfX==3 || numOfO==3 ) {
				gotResult = true;
			}
		}
	
		//输出结果
		if ( gotResult == true ) {
			if ( numOfX == 3 ) {
				System.out.println("使用X符号的人获胜");
			}
			else if ( numOfO == 3 ) {
				System.out.println("使用O符号的人获胜");
			}		
		}
		
	}
}
