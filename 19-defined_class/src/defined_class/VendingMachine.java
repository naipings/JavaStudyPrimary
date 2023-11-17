package defined_class;

public class VendingMachine { //我们定义了一个叫VendingMachine的类

	//这个类有3个属性
	int price = 80; //价格
	int balance; //余额
	int total; //所有收进来的钱
	
	//可以进行4种操作（动作）
	void showPrompt() {
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount) {
		balance = balance +amount;
	}
	
	void showBalance() {
		System.out.println(balance);
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
		//定义类
		//类是定义了这个类的所有对象长什么样，而对象是这个类的一个个的具体的实例。在类里面所定义的变量，在每一个对象当中存在，并且在每一个对象当中都是不一样的。
		//实例：自动售货机
		VendingMachine vm = new VendingMachine(); //定义这个类过后，用new的方式制造出这个类的一个对象来
		
		//然后就可以让这个对象做我们设计出来的这些动作
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		
		VendingMachine vm1 = new VendingMachine();
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance(); //说明vm1与vm两个对象变量管理的是两个不同的对象，因为它们的内部有不同的值
		
	}

}
