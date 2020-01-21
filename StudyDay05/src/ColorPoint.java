class Point{
	private int x, y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y) {
		this.x =x;
		this.y =y;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ColorPoint extends Point{
	int x;
	int y;
	String color;
	
	public ColorPoint() {
		super();
		this.color="BLACK";
	}
	
	public ColorPoint(int x, int y) {
		this.x= x;
		this.y =y;
		this.color = " BLACK";
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		
		return this.color +"색의 ("+this.getX()+","+this.getY()+")의 점";
	}

	public static void main(String[] args) {

		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString());
		
		
	}

}
