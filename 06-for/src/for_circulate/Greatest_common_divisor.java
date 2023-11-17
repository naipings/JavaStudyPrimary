package for_circulate;

import java.util.Scanner;

public class Greatest_common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//两个整数的最大公约数
		//法一：枚举法（比较“笨重”）
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int gcd = 1;
//		
//		for ( int i=2; i<=a && i<=b; i++ ) {
//			if ( a % i == 0 && b % i == 0 ) {
//				gcd = i;
//			}
//		}
//		System.out.println(a+"和"+b+"的最大公约数是"+gcd);
		
		
		//法二：辗转相除法
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int oa = a;
		int ob = b;
		
		while ( b != 0 ) {
			int r = a % b;
			System.out.println(a+", "+b+", "+r);
			a = b;
			b = r;			
		}
		System.out.println(oa+"和"+ob+"的最大公约数是"+a);
	}

}
