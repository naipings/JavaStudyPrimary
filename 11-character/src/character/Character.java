package character;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字符类型
		Scanner in = new Scanner(System.in);
		
		//单个字符的类型：char 	
//		char c = 'a';
//		System.out.println(c);
//		
//		char c2 = '1';
//		System.out.println(c2);
//		
//		char c3 = '汉';			//由于Java采用unicode编码，所以支持汉字等多种语言
//		System.out.println(c3);
//			
//		//字符计算
//		char c4 = 'A';
//		c4++;
//		System.out.println(c4);
//		
//		char c5 = '汉';
//		c5++;					//根据Unicode的编码规则，'汉'这个字对应的编码+1，得到的是unicode编码集中，'汉'后面的那个字
//		System.out.println(c5);
//		
//		char c6 = 'A';
//		char c7 = 'D';
//		System.out.println(c7 - c6); //差值表示两个字母之间的距离
//		System.out.println((int)c6); //(int)c6得到的是A这个字母在Unicode中的编码值
//		
//		char c8 = '\u0041'; //0041是一个16进制的数，这个16进制的数是一个unicode的编码，\ u（在注释中，反斜杠u连在一起会报错）表明这是一个Unicode的编码
//		System.out.println(c8);
//		char c9 = 65;
//		System.out.println(c9);
//		
//		int i = 'Z' - 'A';
//		System.out.println(i);
		
		
		//大小写的转换
		char c = 'A';
		char d = (char)(c + 'a'-'A'); //把大写A转换成小写a
		System.out.println(d);
		
		char e = 'a';
		char f = (char)(e + 'A'-'a'); //把小写a转换成大写A
		System.out.println(f);
		
		
		//字符大小
		System.out.println('A'>'B');
		System.out.println('a'>'A');
		System.out.println('汉'>'A');
		
	}

}
