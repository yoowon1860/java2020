
public class Exception0 {

	public static void main(String[] args) {

		int intArray [] = new int[5];
		
		try {
			intArray[3] = 2;
			intArray[6] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다");
		}
	}

}
