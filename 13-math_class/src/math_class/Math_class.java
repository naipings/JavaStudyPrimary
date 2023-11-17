package math_class;

import java.util.Scanner;

public class Math_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Math类
		//例如：
		//abs		算绝对值
		//pow		算幂次
		//random	提供随机数
		//round		做四舍五入
		
		System.out.println(Math.abs(-12));
		
		System.out.println(Math.round(10.345));
		System.out.println(Math.round(10.645));
		System.out.println(Math.round(10.495));
		
		System.out.println(Math.random()); //0-1之间的随机数
		System.out.println(Math.random()*100); //0-100之间的随机数
		
		System.out.println(Math.pow(2,3));
		System.out.println(Math.pow(2,3.2));
		
		
		
	}

}
