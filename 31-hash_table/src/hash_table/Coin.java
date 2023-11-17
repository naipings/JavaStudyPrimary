package hash_table;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>(); //这就是一个Hash表，Hash表是一种数据结构，也是一种特殊的容器；
	//在这种数据结构中，所有的东西是以一对值放进去的。一个叫作key（键），一个叫作value（值）。放在Hash表里面的东西，都是由一个key和一个value来放进去的。
	//我们把它放进去的时候，告诉Hash表说：这个值它对应的就是这个键；
	//当我们要把它取出来的时候，你给我把那个键所代表的那个值拿出来。
	
	//Hash表初始化
	public Coin() {
		//coinnames.put(key, value);
		//为什么key的类型是Interge而不是int：因为这是面向对象程序设计，所以在这些容器里面，所有的类型都必须是对象，而不能是基本元素；
		//因此float、double这些都不行，String可以，Interge可以，我们知道Interge是int的包裹类型。
		
		//为什么直接放入1就可以了：我们也知道，一个包裹类型的变量，可以直接接收它所对应的基础类型的变量。
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		
		//coinnames.put(50, "五毛");
		System.out.println(coinnames.keySet().size()); //可以在调试用，告诉我们所有的key有多少个。
		System.out.println(coinnames); //直接输出容器里面的内容。	
		//可知：对于Hash来说，key（键）一定是唯一的。如果多次放同一个键的值进去，不管那个值是否相同，只要是同一个键放进去了多次，那么留下来了的只有最后一次。
		
		//如果要遍历一个Hash表
		for ( Integer k : coinnames.keySet() ) { //coinnames.keySet()就给出了这个Hash表所有的key的那么一个集合
			String s = coinnames.get(k); //coinnames.get(k)获取每一个k（也就是相应的key）所对应的那个value（值）
			System.out.println(s);
		}
	}
	
	public String getName(int amount) {
		if ( coinnames.containsKey(amount) ) { //如果存在amount这样的一个key（键）的话
			return coinnames.get(amount);
		}
		else {
			return "NOT FOUND";
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hash表
		
		//例：查找硬币名称
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
