class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y =y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p+"입니다.");
		
		Point a = new Point(2,3);
		Point b = new Point(3,4);
		Point c = new Point(2,3);
		if(a == b)
			System.out.println("a==b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(a.equals(b))
			System.out.println("a is equal to b");

	}

}
