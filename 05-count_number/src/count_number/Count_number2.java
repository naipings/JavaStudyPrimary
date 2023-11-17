package count_number;

import java.util.Scanner;

public class Count_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int count = 100;
		int count = 10;
//		while ( count >= 0 ) {
		while ( count > 0 ) {
			System.out.println(count);
			count = count - 1;
//			System.out.println(count);
		}
		System.out.println(count);
		System.out.println("发射！");
	}

}
