package interaction_of_objects;

public class Display {
	
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//对象的交互（包括Clock.java和Display.java两个类）
		//在Clock.java中运行
		
		
	}

}
