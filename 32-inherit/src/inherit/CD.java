package inherit;

public class CD extends Item { //这句话含义就是让CD成为Item的子类，这就是继承
	private String artist;
	private int numofTracks;	

	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);
//		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.print(":"+artist);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("a", "b", 2, 2, "...");
		cd.print();
		
	}
	
}
