package clock;

import display.Display; //当需要使用另一个包里面的相关类时，就需要import。把那个包里面的那个类的定义给引过来
						//import 包的名字.类的名字

//还有一种引用写法：
//import display.*; 
//表示我们要引用display包里面的所有东西
//这种用法可以用，但是有不太好的地方（万一存在重名的的东西）。


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
		//包
		Clock clock = new Clock();
		clock.start();
		
	}

}
