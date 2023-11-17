package dome;

public class DVD { //DVD类
	private String title;
	private String director;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
		
	public DVD(String title, String director, int playingTime, String comment) {
		super();
		this.title = title;
		this.director = director;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	public void print() {
		System.out.println("DVD:"+title+":"+director);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
