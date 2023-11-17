package upward_styling;

public class Upward_styling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//向上造型
		
		//造型cast
		//1.子类的对象可以赋值给父类的变量
		//————注意！Java中不存在对象对对象的赋值！！
		//2.父类的对象不能赋值给子类的变量！
		//例：Vehicle是Car与Bicycle的父类：
		//Vehicle v;
		//Car c = new Car();
		//v = c; //可以
		//c = v; 编译错误！
		
		//3.可以用造型：
		//c = (Car) v;
		//（只有当v这个变量实际管理的是Car才行）
		
		//验证以上内容实例：（以32-继承为例,可以试着在Database.java的main()中敲入）：
		//针对2.
		//Item item = new Item("a", 0, true, "...");
		//CD cd = item; //这里就会报错（原因：父类的对象不能赋值给子类的变量！）
		
		//针对3.
		//反过来就可以：
		//Item item = new Item("a", 0, true, "...");
		//CD cd = new CD("a", "a", 0, 0, "...");
		//item = cd;
		//CD cc = item; //原则上来说，此时item里面放的是一个cd的对象，它应该可以被交给一个cc的变量才对；
							//但是，从编译器的角度来说，我们的编译器没有这么高级，它看不明白那么多事，所以它认为说，这是一个Item类型的变量，你要想交给一个CD类型的变量，这事它不答应。
							//有一个绕过去的办法是：CD cc = (CD)item;				
		//但是如果是这种情况：
		//Item item = new Item("a", 0, true, "...");
		//CD cd = new CD("a", "a", 0, 0, "...");
		//CD cc = (CD)item; //写代码时不会提醒报错，但是，编译时会出错（类造型异常）
		//（只有当item这个变量实际管理的是CD才行）
		
		
		//造型
		//用括号围起类型放在值的前面
		//对象本身并没有发生任何变化
		//————所以不是“类型转换”
		//运行时有机制来检查这样的转化是否合理
		//————ClassCastException
		
		//int i = (int)10.2; //类型转换
		//类型转换和造型是不同的，因为类型转换过后10.2不再是10.2了，这个值被换成了其对应的int类型的值，即：10；
		//而造型做完以后，我是把你当作另外一个类型来看待，我并没有把你改造成另外一个类型
		//Item item = new Item("a", 0, true, "...");
		//CD cd = new CD("a", "a", 0, 0, "...");
		//item = (Item)cd;//向上造型(Item)可写可不写。//验证时，在这行上设置一个断点进行跟踪，观察赋值前后item与cd的类型变化。
						  //item类型变了，cd类型未变，尽管我们说我们要把cd造型成Item，但是，那只是说我们要把这个cd当作一个Item来看待，并不是要把这个cd转变成一个Item的对象。
		
		
		//向上造型
		//拿一个子类的对象，当作父类的对象来用
		//向上造型是默认的，不需要运算符
		//向上造型总是安全的
		
	}

}
