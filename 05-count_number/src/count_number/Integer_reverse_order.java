package count_number;

import java.util.Scanner;

public class Integer_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//整数逆序
		//法一
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		do {
//			int digit = number % 10;
//			System.out.println(digit);
//			number = number / 10;
//		} while ( number > 0 );
//		System.out.println(); //输出一个空行
//	}
	
		//法二(两者输出样式不一样)
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		do {
			int digit = number % 10;
			result = result*10+digit;
			number = number / 10;
		} while ( number > 0 );
		System.out.println(result);
		
	}

}
