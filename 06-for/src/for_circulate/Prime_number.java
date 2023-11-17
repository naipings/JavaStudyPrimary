package for_circulate;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//素数判断
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入n：");
//		int n = in.nextInt();
//		int flag = 0;  //boolean flag = false;
//		for ( int i=2; i<n; i++ ) {
//			if ( n % i == 0 ) {
//				flag = 1; //flag = true;
//				break;
//			}
//		}
//		
//		if ( flag == 1 ) { //if ( flag )
//			System.out.println(n+"不是素数");
//		}
//		else {
//			System.out.println(n+"是素数");
//		}
//	}
		
	
		//判断100以内的素数
//		Scanner in = new Scanner(System.in);
//		int n = 100;
//		for ( int j=2; j<n; j++ ) {
//			int flag = 0;
//			for ( int i=2; i<j; i++ ) {
//				if ( j % i == 0 ) {
//					flag = 1;
//					break;
//				}
//			}	
//			//输出素数
//			if ( flag == 0 ) {
//				System.out.print(j+" "); //使用print而不是println，目的是：print每次输出不会导致换行；而println每次输出后，下一次输出要换行。
//			}
//		}
		
				
		//输出前50个素数
		Scanner in = new Scanner(System.in);
		int cnt = 0;
		for ( int j=2; cnt<50; j++ ) {
			int flag = 0;
			for ( int i=2; i<j; i++ ) {
				if ( j % i == 0 ) {
					flag = 1;
					break;
				}
			}	
			//输出素数
			if ( flag == 0 ) {
				System.out.print(j+" ");
				cnt++;
			}
		}
					
	}
}
