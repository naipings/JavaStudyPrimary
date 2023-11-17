package object_array;

import java.util.ArrayList;

public class NoteBook {
	
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
		//对象数组
		
		//对象数组中的每个元素都是对象的管理者而非对象本身
		
		int[] ia = new int[10];
		String[] a = new String[10]; //我们做了10个格子，每个格子里面都是String的管理者，并且目前它们没有管如何东西，所以都是null
		
		System.out.println(ia[0]);
		System.out.println(a[0]);
		
		System.out.printf("\n");
		
		System.out.println(ia[0]+2);
		System.out.println(a[0]+"a");
		
		//获取null的长度会报错
		//System.out.println(a[0].length());
		//String s = null;
		//System.out.println(s.length());
		
		//做完赋值过后才能输出length()
		for ( int i=0; i<a.length; i++ ) {
			a[i] = ""+i;
		}
		System.out.println(a[0].length());
		
		
		//下面代码对本节内容而言，无用。
//		String[] m = new String[2];
//		m[0] = "first";
//		m[1] = "second";
//		
//		NoteBook nb = new NoteBook();
//		nb.add("first");
//		nb.add("second");
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		
//		nb.add("third", 1);
//		System.out.println(nb.getNote(1));
//		
//		nb.removeNote(1);
//		
//		String[] a = nb.list();
//		for ( String s : a ) {
//			System.out.println(s);
//		}
	}

}
