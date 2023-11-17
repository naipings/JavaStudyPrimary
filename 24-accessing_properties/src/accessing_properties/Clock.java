package accessing_properties;

public class Clock {
	
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void start() {
		while ( true ) {
			minute.increase();
			if ( minute.getValue() == 0 ) {
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//访问属性
		//二.开放的访问属性
		
		//public
		//任何人都可以访问
		//————任何人指的是在任何类的函数或定义初始化中可以使用
		//————使用指的是调用、访问或定义变量
		
		//例如：上面的：new Display(24)、minute.increase()、hour.increase()、minute.getValue()等等。
		
		
		//如果我们没有在一个成员前面加上public或者private来限定它，那么我们把它叫作“friendly”，意思是说：和它位于同一个包的其他类可以访问。
		
		//例如先在Display.java中的getValue()函数。
		
		
		//一个编译单元（即：一个.java文件，也就是一个源代码文件），可以有很多Java类，但是只能有一个类是public。
		//注：编译单元的意思是：编译的时候，一次对这一个编译单元去做编译的动作，所以我们一次拿一个.java文件来做编译。
		
	}

}
