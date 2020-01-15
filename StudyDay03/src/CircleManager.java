import java.util.Scanner;

class Circle5{
	private double x, y;
	private int radius;
	public Circle5(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+this.x+","+this.y+")"+this.radius);
	}
}
public class CircleManager {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Circle5 [] c = new Circle5[3];
		for (int i = 0; i < c.length; i++) {
			System.out.println("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle5(x, y, radius);
		}
		for(int i=0; i<c.length;i++) c[i].show();
		sc.close();
	}

}
