package member_variable_and_member_functions;

public class VendingMachine { //我们定义了一个叫VendingMachine的类


	int price = 80; //价格
	int balance; //余额
	int total; //所有收进来的钱
	
	//this的特殊使用场景之一：
	void setPrice(int price) {
		//price = price;    //由于这个成员函数本身的参数表里面也有变量price，因此，如果在该函数的语句中只写price，它永远指的是该成员函数参数表里面的那个price
		this.price = price; //因此，为了访问这个类（VendingMachine）的那个price,我们使用this.price来访问VendingMachine的那个price
		
		
		//两种调用含义一样，原因：
		//在成员函数内部直接调用自己（this）的其他函数（即：可以省略this.）
		//this.getFood();
		//getFood();
	}
	
	void showPrompt() {
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount) {
		balance = balance +amount;
		
		//所以，在一个成员函数内部去调用其他成员函数，只要直接去调那个函数就可以了
		showBalance();
	}
	
	void showBalance() {
		System.out.println(balance);
		System.out.println(this.balance); //两者是一模一样的（含义相同），关注this这个特殊的成员变量（手机截屏或者保存课件中）
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
		//成员变量和成员函数
		//仍以自动售货机为例：
		VendingMachine vm = new VendingMachine();
		
		//调用函数：
		//通过.运算符调用某个对象的函数
		//在成员函数内部直接调用自己（this）的其他函数（即：可以省略this.）
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		
		VendingMachine vm1 = new VendingMachine();
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
		
	}

}

