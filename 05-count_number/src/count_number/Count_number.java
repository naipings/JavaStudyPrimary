package count_number;

import java.util.Scanner;

public class Count_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求整数位数
// 目前该程序对于0而言是有问题的
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		int i = 0;
//		int cnt = 0;
//		for ( i=0; number>0; i++ ) {
////		while ( number > 0 ) {
//			number = number / 10;
//			cnt++;
////		System.out.println("number="+number+"; cnt="+cnt); //调试用
//		}
//
//		System.out.println(cnt);
//	}
	
//解决方案如下：
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int i = 0;
		int cnt = 0;
		do {
			number = number / 10;
			cnt++;
//			System.out.println("number="+number+"; cnt="+cnt); //调试用
		} while ( number > 0 );
		
		System.out.println(cnt);
	}

}
