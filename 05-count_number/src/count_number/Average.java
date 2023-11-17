package count_number;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//算平均数
		Scanner in = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		int count = 0;
		
		//法一
//		while ( number != -1 ) {
//			number = in.nextInt();
//			if ( number != -1 ) {
//				sum = sum + number;
//				count++;
//			}
//		} 
		
		//法二
		number = in.nextInt();
		while ( number != -1 ) {
			sum = sum + number;
			count++;
			number = in.nextInt();			
		} 
		

		if ( count > 0 ) {
			System.out.println("平均数="+sum*1.0/count);
		}
	}

}
