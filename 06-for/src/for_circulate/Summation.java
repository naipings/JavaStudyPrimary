package for_circulate;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求和:1 + 1/2 + 1/3 + ··· + 1/n
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		double sum = 0.0;
//		for ( int i=1; i<=n; i++ ) {
//			sum += 1.0/i;
//		}
//		System.out.println(sum);
//		System.out.printf("%.2f", sum); //使用printf是为了让输出具有规定的格式
		
		
		//求和:1 - 1/2 + 1/3 -1/4 + ··· + 1/n //可以使用sign，也可以使用if语句：判断i%2 ==1 或者==0
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		int sign = 1;
		for ( int i=1; i<=n; i++ ) {
			sum += sign * 1.0/i;
			sign = -sign;
		}
		System.out.println(sum);
		System.out.printf("%.2f", sum); //使用printf是为了让输出具有规定的格式
	}
}
