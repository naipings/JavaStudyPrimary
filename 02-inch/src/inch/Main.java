package inch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1.2-1.1);
		
		int foot = 0;
		float inch = 0;
		foot = (int)(30/3.0); //类型转换（将(int)看作一个单目运算符，其优先级最高，故要对后面表达式加上一个括号）
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextFloat();
		System.out.println(10/3);
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((foot+inch/12)*0.3048);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm"); //强制类型转换
		
	}

}