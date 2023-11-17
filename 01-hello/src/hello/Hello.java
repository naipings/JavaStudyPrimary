package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		System.out.println("你好");
		
//		Scanner in = new Scanner(System.in);
//		System.out.println(in.nextLine());
//		System.out.println("echo:" + in.nextLine());
		
		System.out.println("2+3="+5);
		System.out.println("2+3="+2+3);
		System.out.println("2+3="+(2+3));
		System.out.println(2+3+"=2+3");
		
		Scanner in = new Scanner(System.in);
//		final int amount = 100; //定义常量
		int amount = 100;
		System.out.print("请输入票面：");
		amount = in.nextInt();
		int price = 0; //定义变量及初始化
		System.out.print("请输入金额：");
		price = in.nextInt(); //赋值
//		System.out.println("100-"+price+"="+(100-price));
		System.out.println(amount+"-"+price+"="+(amount-price));		
	}

}
