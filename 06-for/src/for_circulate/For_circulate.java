package for_circulate;

import java.util.Scanner;

public class For_circulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//阶乘
		Scanner in = new Scanner(System.in);
		System.out.println("请输入n：");
		int n = in.nextInt();
		int factor = 1;
		for ( int i=1; i<=n; i++ ) {
			factor = factor * i; //factor *= i;
			//注：复合赋值对于 a *= b+6; ————> a = a*(b+6); 
		}
		System.out.println("factor="+factor);
		
	}

}
