package multipleconstructors;

public class Test {
	private int x;
	private int y;
	public Test(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Test(double x, double y) {
		super();
		this.x = (int)x;
		this.y = (int)y;
	}
	
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	
	

}
