package function_call;

import java.util.Scanner;

public class Function_call {

	public static void f() {
		System.out.println("f()");
	}
	
	public static int max(int a, int b) {
		int ret;
		if ( a>b ) {
			ret = a;
		}
		else {
			ret = b;
		}		
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//函数调用
		//相关内容可见手机截屏或者保存的课件
		f();

		int a = 5;
		int b = 6;
		int c = 0;
		c = max(10, 12);
		c = max(a, b);
		c = max(a, 23);
		c = max(c, 23);
		c = max(max(c, a), max(5, b));
		System.out.println(max(a, b));
		
		
		//有个注意：void()函数可以使用不带值的return，也可以不使用return；但是这种函数不能使用带值的return
		//如果函数有返回值，则必须使用带值return
		
	}

}
