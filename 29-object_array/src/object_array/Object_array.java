package object_array;

import java.util.ArrayList;

class Value { //为了验证有关本节内容的相关知识，我们另外去实现一个类
	private int i;
	
	public void set(int i) {
		this.i = i;
	}
	
	public int get() {
		return i;
	}
}

public class Object_array {
	
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		int[] ia = new int[10];
		String[] a = new String[notes.size()];
//		for ( int i=0; i<notes.size(); i++ ) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);		
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//对象数组的for-each循环
		
		//如果是int的数组
//		int[] ia = new int[10];
//		for ( int i=0; i<ia.length; i++ ) {
//			ia[i] = i;
//		}
//		for ( int k : ia ) {
//			System.out.println(k);
//			k ++; //我们在学习数组时就知道，k++没有意义。因为k只是ia每个元素的复制品，改变k无法改变ia里面的元素值
//		}
//		
		//但是情况在对象数组中会有些变化
		Value[] a = new Value[10];
		for ( int i=0; i<a.length; i++ ) {
			a[i] = new Value();
			a[i].set(i);
		}
		for ( Value v : a ) { //这句话的含义就是，我们定义v这个变量，循环每一轮（例如第一轮），v=a[0]，对于对象变量而言，v这个变量指向了a[0]所管理的对象，它去和a[0]共同管理a[0]所指向的那个对象。
			System.out.println(v.get());
			v.set(0); //所以通过v.set(0);我们就修改了v与a[0]所共同管理的那个对象的值，然后循环每一轮都在依次修改。
		}
		System.out.printf("\n");
		for ( Value v : a ) {
			System.out.println(v.get());
		}
			
		//那么对于那个容器（ArrayList<String>），for-each循环又会有什么不一样的地方
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("first");
		aa.add("second");
		for ( String s : aa ) {
			System.out.println(s);
		}
		//所以对于容器类来说，for-each循环也是可以用的。
	}

}
