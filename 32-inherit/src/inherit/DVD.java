package inherit;

public class DVD extends Item { //和CD一样，DVD也是Item的子类
	private String director;
		
	public DVD(String title, String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);
//		this.title = title;
		this.director = director;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public void print() {
		//System.out.println("DVD:"+title+":"+director);
		System.out.print("DVD:");
		super.print(); //表示调用父类的print()
		System.out.print(":"+director);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("a", "b", 1, "...");
		dvd.print();
	}

}
