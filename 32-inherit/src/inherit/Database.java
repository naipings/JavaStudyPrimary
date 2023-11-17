package inherit;

import java.util.ArrayList;

public class Database { //资料库类
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
		
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}

	public void add(Item item) {
		listItem.add(item);
	}
	
	public void list() {
//		for ( CD cd : listCD ) {
//			cd.print();
//		}
//		
//		for ( DVD dvd : listDVD ) {
//			dvd.print();
//		}
		
		for ( Item item : listItem ) {
			item.print();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//继承	
			
		Database db = new Database();
		db.add(new CD("abc", "aaa", 4, 60, "...")); //向上造型（见34）
		db.add(new CD("def", "sdf", 5, 30, "..."));
		//db.list();

		db.add(new DVD("xxx", "cvm", 60, "..."));
		db.list();
		
	}

}

