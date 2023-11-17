package display;

public class Display {
	
	private int value = 0;
	private int limit = value;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	//int getValue() { //此时由于Clock.java与Display.java位于两个不同的包里面，所以在Clock.java中，该函数为不可见的了，因此，必须在其前面加上public。
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}

}
