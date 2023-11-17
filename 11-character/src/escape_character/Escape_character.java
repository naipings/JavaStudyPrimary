package escape_character;

import java.util.Scanner;

public class Escape_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//逃逸字符
		//用来表达无法打印出来的控制字符或特殊字符，它由一个反斜杠“\”开头，后面跟上另一个字符，这两个字符合起来，组成了一个字符
		Scanner in = new Scanner(System.in);
		
		System.out.println("abc\bd"); //eclipse看不到效果，要到终端去执行才能看到效果
		
		//制表位：
		//每行的固定位置
		//一个\t使得输出从下一个制表位开始
		//用\t才能使得上下两行对齐
		System.out.println("abc\t123");
		System.out.println("a\t123");
		
		
		
		
		
		
		
	}

}
