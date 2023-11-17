package collection_container;

import java.util.ArrayList;
import java.util.HashSet;

class Value { //为了验证有关本节内容的相关知识，我们另外去实现一个类
	private int i;
	
	public void set(int i) {
		this.i = i;
	}
	
	public int get() {
		return i;
	}
	
	public String toString() { //也就是把这个i变成字符串
		return ""+i;
	}
}

public class Collection_container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//集合容器（Set）
		
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		for ( String k : s ) {
			System.out.println(k);
		}
		
		System.out.printf("\n");
		
		//看看与ArrayList<String>的区别：
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		a.add("first");
		for ( String k : a ) {
			System.out.println(k);
		}
		
		//为什么？
		//这个Set就是数学当中的Set，也就是集合的意思。集合的基础概念就是：在集合当中是没有重复的元素的。
		
		System.out.printf("\n");
		
		//我们可以不需要写一个循环来看Set里面的内容：
		System.out.println(s);
		
		System.out.printf("\n");
		
		//同样对ArrayList<String>来说也一样：
		System.out.println(a);
		
		//Set还有一个特点，里面的东西是不排序的。
		
		System.out.printf("\n");
		
		//为什么我们能够System.out.println()直接去输出那个Set呢？
		//回顾前面的Value类
		Value v = new Value();
		v.set(10);
		System.out.println(v); //当我们没有在Value里面定义public String toString()时，其输出的东西与定义了这个函数后，输出的不一样。
		
		//任何一个Java的类，只要去实现了一个public String toString()，只要长成这个样子，必须完全一样，有了这么一个函数以后，你就可以让System.out.println()去直接替你输出这个对象。它会主动的去调用这个toString()函数，用toString()函数产生的那个String来把它输出。
		//所以我们可以想见：ArrayList<String>也好，HashSet<String>也好，一定也都实现了toString()函数。因此我们才能直接在下面调用这个toString()函数，去输出这两个容器里面的内容。
		
	}

}
