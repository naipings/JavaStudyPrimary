package function_definition;

import java.util.Scanner;

public class Summation {
	
	public static void sum(int a, int b) {
		int i;
		int sum = 0;
		for ( i=a; i<=b; i++ ) {
			sum += i;
		}
		System.out.println(a+"到"+b+"的和是"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//二.函数定义实例：
		//求和：求出1到10、20到30和35到45的三个和
		//最繁琐的方法是写三段循环，更简单、更常规的方法就是利用函数
		sum(1, 10);
		sum(20, 30);
		sum(35, 45);
		
	}

}
