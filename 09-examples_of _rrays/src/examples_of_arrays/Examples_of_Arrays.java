package examples_of_arrays;

import java.util.Scanner;

public class Examples_of_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的例子：素数
		//素数判断：减少循环次数方法：去掉偶数后，从3到x-1，每次加2
		//如果x是偶数，立刻；
		//否则要循环（n-3）/2+1遍；
		//当n很大时就是n/2遍
		
		//更进一步减少循环次数（从数学的角度）：无须到x-1，到sqrt(x)就够了
		//只需要循环sqrt(x)遍
		
		//n————> n/2————> sqrt(n)
		
		//更更进一步：只需判断是否能被已知的且<x的素数整除
		//————构造素数表
		//根据素数定义构造：
//		Scanner in = new Scanner(System.in);
//		int[] primes = new int[50];
//		primes[0] = 2;
//		int cnt = 1; //初始化为1有两层含义：下一个发现的素数放到primes[1]里面去；记录primes数组里面的元素个数，此时刚好为1个
//		MAIN_LOOP:
//		for ( int x=3; cnt<50; x++ ) {
//			for ( int i=0; i<cnt; i++ ) {
//				if ( x % primes[i] == 0 ) {
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x; //x放到primes[cnt]的位置上去，然后让cnt指向下一个位置上去（cnt+1）
//		}
//		
//		for ( int k : primes ) {
//			System.out.print(k+" ");
//		}
		
		
		//更适合计算机的构造方法：
		//欲构造n以内的素数表
		//1.令x=2
		//2.将2x、3x、4x直至ax<n的数标记为非素数
		//3.令x为下一个没有被标记为非素数的数，重复2；直到所有的数都已经尝试完毕。
		Scanner in = new Scanner(System.in);
		boolean[] isPrime = new boolean[100];
		for ( int i=0; i<isPrime.length; i++ ) {
			isPrime[i] = true;
		}
		
		for ( int i=2; i<isPrime.length; i++ ) {
			if ( isPrime[i] ) {
				for ( int k=2; i*k<isPrime.length; k++ ) {
					isPrime[i*k] = false;
				}
			}
		}
		
		for ( int i=2; i<isPrime.length; i++ ) {
			if ( isPrime[i] ) {
				System.out.print(i+" ");
			}
		}
		
	}
}
