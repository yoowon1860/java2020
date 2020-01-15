
public class Human {
	String name;
	int age;
	double height, weight;
	
	public Human(String name) {
		this.name = name;
	}
	
	public double getSum(double array[]) {
		double sum =0;
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Human aHuman = new Human("홍길동");
		aHuman.age = 21;
		aHuman.height = 180.5;
		aHuman.weight= 73.2;
		
		Human [] array = new Human[5];
		
	}

}
