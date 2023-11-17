package array_calculation;

import java.util.Scanner;

public class Array_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组计算
		//一、投票统计（数组下标的灵活运用）
//		Scanner in = new Scanner(System.in);
//		int x;
//		int[] numbers = new int[10];
//		for (int i=0; i<numbers.length; i++ ) { //用于验证，其实new所得数组的默认值都是0
//			System.out.print(numbers[i]+" ");
//		}
//		System.out.printf("\n");
//		
//		x = in.nextInt();
//		while ( x != -1 ) {
//			if ( x>=0 && x<=9 ) {
//				numbers[x]++;
//			}
//			x = in.nextInt();
//		}
//		for (int i=0; i<numbers.length; i++ ) {
//			System.out.println(i+":"+numbers[i]);
//		}
		
		
		//二、遍历数组，搜索某个数据
//		Scanner in = new Scanner(System.in);
//		int[] data = {3, 2, 5, 7, 4, 9, 11, 34, 12, 28};
//		int x;
//		x = in.nextInt();
//		int loc = -1;
//		for ( int i=0; i<data.length; i++ ) {
//			if ( x == data[i] ) {
//				loc = i;
//				break;
//			}
//		}
//		if (loc > -1 ) {
//			System.out.println(x+"是第"+(loc+1)+"个");
//		}
//		else {
//			System.out.println(x+"不在其中");
//		}
		
		//如果只是判断某个数据在不在，不用输出具体位置
		Scanner in = new Scanner(System.in);
		int[] data = {3, 2, 5, 7, 4, 9, 11, 34, 12, 28};
		int x;
		x = in.nextInt();
		boolean found = false;
		//for-each循环：对于data数组中的每一个元素，循环的每一轮，把它拿出来，作为一个k。循环的每一轮k都在变，第一轮k=data[0]，第二轮k=data[1]，以此类推。
		for ( int k : data ) {
			if ( k == x ) {
				found = true;
				break;
			}
		}
		if ( found ) {
			System.out.println("找到"+x);
		}
		else {
			System.out.println("未找到"+x);
		}
		
		
		//for-each循环特别适合于：遍历一个数组的场合。去遍历整个数组，拿出数组中的每一个元素出来做一些事情，如：作比较、或者赋值给别人等等。
		//for-each循环注意：（不能用于修改数组里面的值）
		for ( int k : data ) {
			k = 0;
		}
		for ( int k : data ) {
			System.out.println(k);
		}
	}
}
