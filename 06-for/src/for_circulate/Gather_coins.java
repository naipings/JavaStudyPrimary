package for_circulate;

import java.util.Scanner;

public class Gather_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//凑硬币
		//如何跳出多重循环，方法一：
//		Scanner in = new Scanner(System.in);
//		int amount = in.nextInt();
//		int flag = 0;:
//		for ( int one = 0; one<=amount; ++one ) {
//			for ( int five = 0; five<=amount/5; ++five ) {
//				for ( int ten = 0; ten<=amount/10; ++ten ) {
//					for ( int twenty = 0; twenty<=amount/20; ++twenty ) {
//						if ( one + five*5 + ten*10 + twenty*20 == amount ) {
//							System.out.println(one+"张1元,"+five+"张5元,"+ten+"张10元,"+twenty+"张20元->"+amount);
//							flag = 1;
//							break;
//						}
//					}
//					if ( flag == 1 ) break;
//				}
//				if ( flag == 1 ) break;
//			}
//			if ( flag == 1 ) break;
//		}
		
				
		//凑硬币
		//如何跳出多重循环，方法二：
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		
		OUT:
		for ( int one = 0; one<=amount; ++one ) {
			for ( int five = 0; five<=amount/5; ++five ) {
				for ( int ten = 0; ten<=amount/10; ++ten ) {
					for ( int twenty = 0; twenty<=amount/20; ++twenty ) {
						if ( one + five*5 + ten*10 + twenty*20 == amount ) {
							System.out.println(one+"张1元,"+five+"张5元,"+ten+"张10元,"+twenty+"张20元->"+amount);
							break OUT;
						}
					}
				}
			}
		}
	}
}
