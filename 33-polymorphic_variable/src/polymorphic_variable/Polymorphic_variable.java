package polymorphic_variable;

public class Polymorphic_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多态变量
		
		//子类和子类型
		//类（class）定义了类型（type）
		//子类（extends）定义了子类型
		//子类的对象可以被当作父类的对象来使用
		//————赋值给父类的变量
		//————传递给需要父类对象的函数
		//————放进存放父类对象的容器里
		
		//子类型与赋值：（子类的对象可以赋值给父类的变量）
		//例：Vehicle是Car与Bicycle的父类，所以可以有：
		//Vehicle v1 = new Vehicle();
		//Vehicle v2 = new Car();
		//Vehicle v3 = new Bicycle();
		
		//子类和参数传递：（子类的对象可以传递给需要父类对象的函数）
		//例如我们在32-继承里面的实例：
		//public class Database {
		//
		//	public void add(Item item) {
		//		...
		//	}
		//
		//DVD dvd = new DVD(...);
		//CD cd = new CD(...);
		//
		//database.add(dvd);
		//database.add(cd);
		
		//子类型和容器：（子类的对象可以放进存放父类对象的容器）
		
		
		//多态变量
		//Java的对象变量都是多态的，它们能保存不止一种类型的对象；
		//它们可以保存的是声明类型的对象，或声明类型的子类的对象；
		//当把子类的对象赋给父类的变量的时候，就发生了向上造型。
		
	}

}
