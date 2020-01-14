import java.util.Arrays;
import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 몇개?");
		int j = sc.nextInt();
		int [] array = new int[j];
		
		for (int i = 0; i < j; i++) {
			array[i] = sc.nextInt();
			for(int k=0;k<i;k++) {
			if(array[k]==array[i]) {
				System.out.println("숫자가 중복되었습니다.");
				i--;
				continue;
			}
			}	
		}
		for (int i = 0; i < j; i++) {
		System.out.print(array[i]+" ");
		}
	}

}
