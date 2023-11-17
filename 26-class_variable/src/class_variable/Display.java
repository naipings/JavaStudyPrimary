package class_variable;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类变量
		
		//仍以Display为例：
		Display d1 = new Display(10);
		Display d2 = new Display(20);
		
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		d1.step = 2; //通过对象去访问成员变量
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		Display.step = 3; //使用类可以访问static的成员变量，其他变量只能通过对象去访问
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		//由上：static的变量叫做什么：我们把它称作：类变量
		//根据本例而言，即：step是Display这个类自带的变量，它不在Display的任何一个对象里面，它只在这个类里面，仅此一份。
		
		
		
	}

}
