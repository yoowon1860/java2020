class Point2{
	private int x, y;
	
	public Point2() {
		this.x=0;
		this.y=0;
	}
	public Point2(int x, int y) {
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
public class Point3D extends Point2{
	
	int x, y, z;
	
public String toString() {
		
		return "("+this.getX()+","+this.getY()+","+this.z+")의 점";
	}

public Point3D(int x, int y, int z) {
	super(x, y);
	this.z = z;
}

public void moveUp() {
	this.z +=1;
}

public void moveDouwn() {
	this.z -=1;
}


protected void move(int x, int y, int z) {
	// TODO Auto-generated method stub
	super.move(x, y);
	this.z = z;
}

	public static void main(String[] args) {

		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString());
		
		p.moveUp();
		System.out.println(p.toString());
		
		p.moveDouwn();
		p.move(10, 10);
		System.out.println(p.toString());
		
		p.move(100, 200, 300);
		System.out.println(p.toString());
	}

}
