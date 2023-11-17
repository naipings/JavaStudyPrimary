package object_initialization;

public class VendingMachine {

	int price = 80;
	int balance = f(); //定义初始化可以调用函数（见下面总结）
	int total;
	
	//我们可以在这做出这么一种函数，其没有返回值类型，且函数名与类的名字相同
	VendingMachine() { //构造函数
		total = 0;
	}
	
	VendingMachine(int price) { //重载
		this(); //用于调用那个没有参数的构造函数
				//注意：1.只能在构造函数里面出现；2.并且只能是这个构造函数的第一句；3.而且也只能使用一次。
		this.price = price;
	}
	
	int f() {
		return 10;
	}
	
	void setPrice(int price) {

		this.price = price; 
		this.getFood();
	}
	
	void showPrompt() {
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount) {
		balance = balance +amount;
		showBalance();
	}
	
	void showBalance() {
		System.out.println(balance);
		System.out.println(this.balance); 
	}
	
	void getFood() {
		if ( balance >= price ) {
			System.out.println("Here you are.");
			balance = balance - price;
			total = total + price;
		}

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//对象初始化
		
		//成员变量定义初始化：
		//成员变量在定义的地方就可以给出初始值
		//没有给出初始值的成员变量会自动获得0值
		//————对象变量的0值表示没有管理任何对象，也可以主动给null值
		//定义初始化可以调用函数，甚至可以使用已经定义的成员变量
		
		
		//构造函数：
		//如果有一个成员函数的名字和类的名字完全相同，则在创建这个类的每一个对象的时候会自动调用这个函数——>构造函数
		//这个函数不能有返回类型
		
		
		//多用debug看看程序是怎么执行的。（断点设在：VendingMachine vm = new VendingMachine();这一句上）
		//						（和VendingMachine vm1 = new VendingMachine(100);这一句上）
		//两次new会进入不同的构造函数中（一个没有参数，一个有参数）
		
		//函数重载：
		//一个类可以有多个构造函数，只要它们的参数表不同
		//创建对象的时候给出不同的参数值，就会自动调用不同的构造函数
		//通过this()还可以调用其他构造函数
		//一个类里的同名但参数表不同的函数构成了重载关系
		
		
		//我们仍以自动售货机为例，来表达上面的语句的含义：
		VendingMachine vm = new VendingMachine();
		
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		
		VendingMachine vm1 = new VendingMachine(100);
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
		
	}

}
