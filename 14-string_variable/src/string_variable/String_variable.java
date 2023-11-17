package string_variable;

import java.util.Scanner;

public class String_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//一.字符串变量
		
		//字符串：用双引号括起来的0个或多个字符就是一个字符串字面量
		//"hello"
		//"1"
		//""
		
		//字符串变量：
		//String s;
		//String是一个类，String的变量是对象的管理者而非所有者
		//————就像数组变量是数组的管理者而非所有者一样
		
		//String的第一个字母S是大写的，大写就表明它不是一个基础类型，它是一个类，它是系统内部当中的一个类
		//注意：包裹类型的第一个字母也是大写的
		
		//new = 创建
		//String s = new String("a string"); 
		//创建一个String的对象
		//用"a string"初始化这个对象
		//创建管理这个对象的变量s
		//让s管理这个对象
		
		//初始化字符串变量
		//也可以这么创建：
		//String s = "hello";
		//编译器帮你创建一个String类的对象交给s来管理
		
		
		//字符串连接
		//用加号（+）可以连接两个字符串
		//————"hello"+"world"——>"helloworld"
		//当这个+的一边是字符串而另一边不是时，会将另一边表达为字符串然后做连接
		//————"	i'm "+18——>"I'm 18"
		//————1+2+"age"——>"3age"
		//————"age"+1+2——>"age12"
//		String s = new String("Hello");
//		System.out.println(s);
//		System.out.println(s+" world");
//		System.out.println(s+12);
//		System.out.println(s+12+24);
//		System.out.println(s+(12+24));
		
		
		//输入字符串
		//in.next();读入一个单词，单词的标志是空格
		//————空格包括空格、tab和换行
		//in.nextLine();读入一整行
//		String s;
//		s = in.nextLine(); //输入This is a test.看看效果
//		System.out.println(s);
//		
//		s = in.next(); //输入This is a test.看看效果
//		System.out.println(s);
		
		
		//比较两个字符串：
		String s;
		s = in.next(); //输入bye看看效果
		System.out.println(s=="bye"); //这里比较的不是s里面的内容是否等于"bye"，而是看s和"bye"是否是同一个字符串
		
		//要想比较s的内容是不是bye，需要使用.equals()
		System.out.println(s.equals("bye"));
		
		//所以可知：==比较两个字符串是否是同一个；equals比较两个字符串的内容是否相同
	}

}
