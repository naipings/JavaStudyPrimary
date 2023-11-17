package compare;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int vs double
		//System.out.println(5==5.0);
		
		//double vs double
		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1; //浮点运算是有误差的
		System.out.println(a==b);
		System.out.println("a="+a+"; b="+b);
		//因此，判断浮点数是否相等的方法
		System.out.println(Math.abs(a-b) < 1e-6);
		
		
//		初始化
		Scanner in = new Scanner(System.in);
//		读入投币金额	
		System.out.print("请投币：");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		if ( amount>=10 ) {
	//		打印车票
			System.out.println("*************");
			System.out.println("*Java城际铁路专线 *");
			System.out.println("*  无指定座位票   *");
			System.out.println("*  票价：10元   *");
			System.out.println("*************");
	//		计算并打印找零
			System.out.println("找零：" + (amount-10) );
		}
	}

}
