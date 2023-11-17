package identification_of_objects;

public class Display {
	
	private int value = 0;
	private int limit = 0;
	
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
		//对象的识别
		
		//以时钟为例：
		//一个四位数显示器，还是两个两位数显示器？		划分为两个两位数显示器，这里才是体现面向对象的思想
		Display d = new Display(24);
		for ( ; ; ) {
			d.increase();
			System.out.println(d.getValue());
		}
		
	}

}
