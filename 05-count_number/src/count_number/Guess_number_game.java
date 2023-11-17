package count_number;

import java.util.Scanner;

public class Guess_number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//猜数游戏
		Scanner in = new Scanner(System.in);
		int number = (int)(1 + Math.random()*100); //Math.random()生成0-1之间的数：[0,1) //该表达式生成1-100之间的整数：[1,100]
		int count = 1;
		int a = 0;
		a = in.nextInt();
		while ( a != number ) {
			if ( a > number ) {
				System.out.println("猜大了");
			}
			else {
				System.out.println("猜小了");
			}
			
			a = in.nextInt();
			count++;
		}
		System.out.println("恭喜你猜对了，你猜了"+count+"次");
	}

}
