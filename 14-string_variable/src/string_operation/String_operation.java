package string_operation;

import java.util.Scanner;

public class String_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//二.字符串操作
		//字符串是对象，对它的所有操作都是通过“.”这个运算符来进行的
		//————字符串.操作
		//它表示对.左边的这个字符串做右边的那个操作
		//这里的字符串可以是变量也可以是常量
		
		
		//Strings大小的比较
		//两个字符串可以比较大小：（根据unicode的编码来判断谁大谁小）
		//————s1.compareTo(s2)
		//如果s1比s2小，那么结果是负的；如果s1和s2相等，那么结果是0；如果s1比s2大，那么结果是正的
		//compareToIgnoreCase可以不区分大小写地来比较大小
//		String s1 = "abc";
//		String s2 = "abb";
//		System.out.println(s1.compareTo(s2));
//		
//		String s3 = "abcd";
//		System.out.println(s1.compareTo(s3));
//		
//		System.out.println("abcd".compareTo(s3));
		
		
		//获取String的长度
		//用length()函数
		//注：这个length()与数组的length不一样
	
		
		//访问String里的字符
		//s.charAt(index)
		//————返回index上的单个字符
		//————index的范围是0到length()-1、
		//————第一个字符的index是0，和数组一样
		//但是不能用for-each循环来遍历字符串
//		String s1 = "abc";
//		String s2 = "汉字";
//		System.out.println(s1.charAt(0));
//		
//		//遍历字符串，打印每个字符（和数组那里有些类似）
//		for ( int i=0; i<s1.length(); i++ ) {
//			System.out.print(s1.charAt(i)+" ");
//		}
//		
//		System.out.printf("\n");
//		
//		for ( int i=0; i<s2.length(); i++ ) {
//			System.out.print(s2.charAt(i)+" ");
//		}
		
		
		//得到字串
		//s.substring(n)
		//————得到从n号位置到末尾的全部内容
		//s.substring(b,e)
		//————得到从b号位置到e号位置之前的内容
//		String s1 = "0123456789汉字";
//		System.out.println(s1.substring(2));
//		System.out.println(s1.substring(2, 4));
		
		
		//寻找字符
		//s.indexOf(c)
		//————得到c字符所在的位置，-1表示不存在
		//s.indexOf(c, n)
		//————从n号位置开始寻找c字符
		//s.indexOf(t)
		//————找到字符串t所在的位置
		
		//从右边开始找
		//————s.lastIndexOf(c)
		//————s.lastIndexOf(c, n)
		//————s.lastIndexOf(t)
//		String s1 = "0123A56789汉字";
//		System.out.println(s1.indexOf('4')); //-1表示没找到4
//		System.out.println(s1.indexOf('A')); //A字符出现在4号位置上
//		System.out.println(s1.indexOf("A56")); //A56字符串出现在4开始的位置上
//		
//		//如果想找到第二个'3'，套路如下：
//		String s2 = "0123A56389汉字";
//		int loc = s2.indexOf('3');
//		System.out.println(s2.indexOf('3', loc+1));
//		
//		//如果想从右边开始寻找
//		System.out.println(s2.lastIndexOf('3'));
		
		
		//其他String操作
		//s.startsWith(t)		字符串s是否以字符串t开头
		//s.endsWith(t)			字符串s是否以字符串t结尾
		//s.trim()				把字符串两端的空格给删掉
		//s.replace(c1, c2)		把字符串里面所有的c1都替换成c2
		//s.toLowerCaase()		把字符串里面所有的字母都变成小写字母
		//s.toUpperCase()		把字符串里面所有的字母都变成大写字母
		
		
		//不可变的String
		//所有的字符串都是不可变的，对它们的操作的结果都是制造新的字符串出来
		String s = "abc ";
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		String s1 = "abcd";
		s1.toUpperCase();
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		
		//在switch-case中使用字符串（但是需要Java版本在1.7及以上时，才能使用这种由字符串来做的switch-case）
		/*
		switch (s) {
		case "this":···break;
		case "that":···break;
		}
		*/
		
	}

}
