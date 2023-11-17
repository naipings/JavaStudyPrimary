package count_number;

import java.util.Scanner;

public class Integer_factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//整数分解
		//任一个整数%10得到其个位；		任一个整数/10可以扔掉其个位。
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		int num = 0;
		while ( number > 0 ) {
			num = number % 10;
			System.out.println(num);
			number = number / 10;
		}
	}

}
