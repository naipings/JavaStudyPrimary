package introduction_to_arrays;

import java.util.Scanner;

public class Introduction_to_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初识数组
		//输入一堆数据，输出所有大于平均数的数
//		Scanner in = new Scanner(System.in);
//		int x = 0;
//		int[] numbers = new int[100]; //表示：number是一个数组，它的类型是int，然后我们创建（new）一个放100个int的number数组。 //new创建的数组会得到默认的0值。
//		double sum = 0;
//		int count = 0;
//		
//		x = in.nextInt();
//		while ( x != -1 ) {
//			numbers[count] = x;
//			sum += x;
//			count++;
//			x = in.nextInt();			
//		}
//		
//		if ( count > 0 ) {
//			double average = sum / count;
//			for ( int i=0; i<count; i++ ) {
//				if ( numbers[i] > average ) {
//					System.out.print(numbers[i]+" ");
//				}
//			}
//			System.out.printf("平均数=%.2f", average);
//		}
		
		
		//代码改进，根据用户需要输入的数据个数，定义数组，进而避免上面代码存在的安全隐患（数组下标越界问题）
		Scanner in = new Scanner(System.in);
		double sum = 0;
		int count = 0;	
		count = in.nextInt();
		
		if ( count > 0 ) {
			int[] numbers = new int[count];
			
//			for ( int i=0; i<count; i++ ) {
			for ( int i=0; i<numbers.length; i++ ) {
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			
			double average = sum / count;
//			for ( int i=0; i<count; i++ ) {
			for ( int i=0; i<numbers.length; i++ ) {
				if ( numbers[i] > average ) {
					System.out.print(numbers[i]+" ");
				}
			}
			System.out.printf("平均数=%.2f", average);
		}
	}
}
