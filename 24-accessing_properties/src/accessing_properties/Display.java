package accessing_properties;

public class Display {
	
	//private表示这个成员变量（或者成员函数）是这个类私有的，也就是只能在这个类里面访问它。
	//能够使用这种成员变量的地方只有两处：1.成员函数内部；2.成员变量初始化时，可以使用别的已经定义的成员变量。
	private int value = 0;
	private int limit = value;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	int getValue() { //没有加上public，相关含义见Clock.java（开放的访问属性）
		return value;
	}

	//注：针对“只有这个类内部可以访问”，private的这个限制是对类而不是对对象的
	//即：同一个类的所有的不同的对象之间，可以互相访问别人的私有的成员。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//访问属性
		//一.封闭的访问属性
		
		//对象 = 属性 + 服务
		//数据：属性或状态
		//操作：函数
		//把数据和对数据的操作放在一起——>封装
		
		
	}

}
