package compare;

import java.util.Scanner;

public class Compare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		两个数的大小比较
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入两个数：");
//		int x = in.nextInt();
//		int y = in.nextInt();
//		int max = 0;
//		if ( x > y ) {
//			max = x;
//		}
//		else {
//			max = y;
//		}
//		System.out.println(max);
		
		
//		三个数的大小比较
		Scanner in = new Scanner(System.in);
		System.out.println("请输入三个数：");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int max = 0;
		if ( x > y ) {
			if ( x > z ) {
				max = x;
			}
			else {
				max = z;
			}
		}
		else {
			if ( y > z ) {
				max = y;
			}
			else {
				max = z;
			}
		}
		System.out.println(max);		
	}

}
