package class_function;

public class Display {
	
	private int value = 0;
	private int limit = value;
	
	private static int step = 1;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public static void f() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类函数
		
		//仍以Display为例：
		Display d1 = new Display(10);
		d1.step = 2;
		System.out.println(d1.step);
		
		Display d2 = new Display(20);
		System.out.println(d2.step);
		
		//以下三种访问都可以
		f();
		d1.f();
		Display.f();
		
		//规则很简单：
		//static的函数只能去调用static的函数；
		//static的函数只能去访问static的成员变量；
		//static的函数和static的成员变量都可以通过类的名字去访问；但是，也可以通过某个对象的名字去访问，只是通过对象名字去访问的时候，它并不能获得那个对象的具体信息。
		
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		d1.step = 2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		Display.step = 3;
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		
	}

}
