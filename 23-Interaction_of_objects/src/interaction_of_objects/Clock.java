package interaction_of_objects;

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
		//对象的交互
		Clock clock = new Clock();
		clock.start();
		
		//通过对象的交互的例子：数字钟我们可以发现：
		//一个类的成员变量可以是其他类的对象
		//————最终的结果就是：一个对象里面其实是由其他对象组成的
		
		//以本例为例：
		//Clock类里面的两个成员变量（hour与minute），是Display类的对象；
		//进而可知：一个Clock的对象（clock）是由两个Display的对象（hour、minute）所组成的。
		
		//而正是借助于Clock里面的start()函数，实现了两个Display对象（hour、minute）之间的互动。
		//从Display的角度看，它们是完全独立的，它们的代码之间没有任何关系。每个Display各自做好自己的事情，由外面的Clock将他们联系起来。
	}

}
