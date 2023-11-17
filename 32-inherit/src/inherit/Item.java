package inherit;

public class Item {
	//如何让子类访问（使用）父类中的成员变量
	//方法一：
	//protected String title; //使用protected而不是private的原因：便于子类在成员函数中使用this.title = title;这样的语句，不然会报错。
	
	//方法二：（课程中多采用这种）
//	private int playingTime;
//	public Item(int playingTime) {
//		super();
//		this.playingTime = playingTime;
//	}
	
	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;

	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public void print() {
		System.out.print(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
