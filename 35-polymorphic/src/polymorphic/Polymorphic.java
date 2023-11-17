package polymorphic;

public class Polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多态
		
		//实例验证：在32-继承的Database.java的 for ( Item item : listItem ) {这一行设置一个断点进行调试观察
		
		//函数调用的绑定
		//当通过对象变量调用函数的时候，调用哪个函数这件事情叫做绑定
		//————静态绑定：根据变量的声明类型来决定
		//————动态绑定：根据变量的动态类型来决定
		//在成员函数中调用其他成员函数也是通过this这个对象变量来调用的
		
		//覆盖override
		//子类和父类中存在名称和参数表完全相同的函数，这一对函数构成覆盖关系
		//通过父类的变量调用存在覆盖关系的函数时，会调用变量当时所管理的对象所属的类的函数
		//————例如：对32-继承：CD里面的print()就覆盖了Item里面的print()，当我们通过一个Item类型的变量去调用print()函数的时候，它会根据实际情况（CD或者DVD），到底是哪一个类，进而去调用相应类的print()函数。
		//————又例如：实例：Shapes
	}

}
