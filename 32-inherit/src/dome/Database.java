package dome;

import java.util.ArrayList;

public class Database { //资料库类
	private ArrayList<CD> listCD = new ArrayList<CD>();
	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	
	public void add(DVD dvd) {
		listDVD.add(dvd);
	}
	
	public void list() {
		for ( CD cd : listCD ) {
			cd.print();
		}
		
		for ( DVD dvd : listDVD ) {
			dvd.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//例：媒体资料库的设计（未采用继承思想时所作）。
		//先设计CD类，然后设计资料库类
			
		Database db = new Database();
		db.add(new CD("abc", "aaa", 4, 60, "..."));
		db.add(new CD("def", "sdf", 5, 30, "..."));
		//db.list();
		
		//接下来我们又想在资料库中放入DVD的相关信息
		//所以我们在上面Database类中加入DVD的相关容器、成员函数
		//同时定义了一个DVD类
		db.add(new DVD("xxx", "cvm", 60, "..."));
		db.list();
		
		//CD与DVD以及Database的相似代码部分太多（存在太多代码复制，不利于后期维护），进而可知：这种程序待优化。
	}

}
