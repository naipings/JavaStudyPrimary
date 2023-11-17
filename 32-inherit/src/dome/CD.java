package dome;

public class CD { // CD（媒体）类
	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;

	// 如何对上面的成员变量进行初始化：下面这个初始化函数可以借助eclipse的构造器帮助构建。方法：
	// 点击左上角Source，选择里面的：Generate Constructor using Field...，然后把需要初始化的成员变量打上勾，点击Generate，即可得到这个CD函数。
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
//		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	public void print() {
		System.out.println("CD:"+title+":"+artist);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
