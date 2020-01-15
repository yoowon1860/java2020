
public class Circle {
	
	int radius;
	public Circle(int i) {
		radius = i;
	}
	public Circle() {
	}
	void set(int r) {
		radius =r;
	}
	double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {

		Circle pizza = new Circle(10);
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		System.out.println(donut.radius);
		
		
	}

}
