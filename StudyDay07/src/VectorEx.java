import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>(31203);
		v.add(5);
		v.add(4);
		v.add(-1);
		
		int i = v.get(1);
		System.out.println(i);
		
		int len = v.size();
		System.out.println(len);
		
		int cap = v.capacity();
		System.out.println(cap);
	}

}
