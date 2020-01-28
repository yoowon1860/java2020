
public class MyPoint {
	int x, y;
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		MyPoint mp = (MyPoint)obj;
		if(x == mp.x && y == mp.y) return true;
		else return false;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}

	public static void main(String[] args) {

		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p.toString());
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
