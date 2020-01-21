package Math;

public class Sub extends Calc{

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		super.setValue(a, b);
		
	}

	@Override
	int calculate() {
		int total = this.a - this.b;
		return total;
	}

}
