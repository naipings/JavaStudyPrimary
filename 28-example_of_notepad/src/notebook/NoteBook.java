package notebook;

import java.util.ArrayList; //意思是，我们现在引入一个类，这个类属于java.util这个包，这个类的名字叫ArrayList

public class NoteBook {
	
	private ArrayList<String> notes = new ArrayList<String>(); //然后我们new一个成员变量，名字叫作notes，它的类型是ArrayList，
															   //后面跟上<String>，含义就是：用来存放String的ArrayList类；
															   //所以，成员变量notes的类型是：用来存放String的ArrayList类
	//这种类型叫作：泛型类。泛型类是一种容器。

	//容器类：
	//ArrayList<String> notes = new ArrayList<String>();
	//容器类有两个类型：
	//容器的类型	————例如：ArrayList
	//元素的类型	————例如：String
	
	//private int size = 0; //可以这么做来得到size，但是有更简单的方法，notes它自带了size()函数
	
	public void add(String s) {
		notes.add(s); //这里的add()是ArrayList<String>里面的add()，不是NoteBook类的这个add()。
		//size++;
	}
	
	public void add(String s, int location) { //把字符串加到某个位置（某个现有元素）的前面去
		notes.add(location, s);
	}
	
	public int getSize() {
		//return size;
		return notes.size(); //直接/使用size()函数
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
		//法一：（通过for循环实现赋值）
//		for ( int i=0; i<notes.size(); i++ ) {
//			a[i] = notes.get(i);
//		}
		
		//法二：（利用系统类库里面的函数直接实现）
		notes.toArray(a); //调用这个函数，它会根据notes里面的内容，直接帮我们把a数组给填满。
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//容器
		//泛型容器类
		
		//记事本的例子
		
		//所需相关功能：
		//能存储记录
		//不限制存储的记录的数量
		//能知道已经存储的记录的数量
		//能查看存进去的每一条记录
		//能删除一条记录
		//能列出所有的记录
		
		//接口设计：
		//add(String note);
		//getSize();
		//getNote(int index);
		//removeNote(int index);
		//list();
		
		String[] m = new String[2];
		m[0] = "first";
		m[1] = "second";
		
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		
		nb.add("third", 1);
		System.out.println(nb.getNote(1));
		
		nb.removeNote(1);
		
		String[] a = nb.list();
		for ( String s : a ) {
			System.out.println(s);
		}
	}

}
