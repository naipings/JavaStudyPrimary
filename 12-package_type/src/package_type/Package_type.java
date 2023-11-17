package package_type;

import java.util.Scanner;

public class Package_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//包裹类型
		//每种基础类型都有对应的包裹类型：
		/*
		基础类型		包裹类型
		boolean		Boolean
		char		Character
		int			Integer
		double		Double
		*/
		
		//包裹类型可以做基础类型的事
		int i = 10;
		Integer k = 10;
		k = i;
		
		//包裹类型的特殊用处
		//包裹类型有一些工具可以帮我们来做一些事情
		//获得该类型的最大最小值
		//Integer.MIN_VALUE
		//Integer.MAX_VALUE
		System.out.println(Integer.MAX_VALUE); //因为在计算机中，对Java来说，要表达int类型需要四个字节，也就是32bitS，所以int类型的表示范围就为：[-2^31, 2^31 -1]，由此可知Integer.MAX_VALUE = 2^31 -1 = 2147483647  
		
		//.运算符
		//当需要让一个类或对象做事情的时候，用.运算符
		//a.length
		//Integer.MAX_VALUE
		
		
		//对于包裹类型Character有：
		/*
		static boolean isDigit(char ch)				判断这个字符是不是数字
		static boolean isLetter(char ch)			判断这个字符是不是字母
		static boolean isLetterOrDigit(char ch)		判断这个字符是不是字母或数字
		static boolean isLowerCase(char ch)			判断这个字符是不是小写字母
		static boolean isUpperCase(char ch)			判断这个字符是不是大写字母
		static boolean isWhitespace(char ch)		判断这个字符是不是一种空格
		static char toLowerCase(char ch)			把这个字符转换成小写
		static char toUpperCase(char ch)			把这个字符转换成大写
		*/
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('一'));
		System.out.println(Character.isDigit('-'));
		
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('I'));
		
		System.out.println(Character.toLowerCase('I'));
		
	}

}
