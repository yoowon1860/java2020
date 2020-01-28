class Rect{
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) { //equals() 오버라이딩
		Rect r = (Rect)obj; //obj를 Rect로 다운 캐스팅
		if(width*height == r.width*r.height) return true;
		else return false;
	}
}
public class RectEqualsEx {

	public static void main(String[] args) {

		Rect a = new Rect(3, 4);
		Rect b = new Rect(4, 3);
		Rect c = new Rect(5,6);
		
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}

}
