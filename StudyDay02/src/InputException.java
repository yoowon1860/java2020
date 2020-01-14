import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0, n=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i+">>");
			
			
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요");
				i--;
				sc.next();
				continue;
			}
			sum += n;
		}
		System.out.println("합은 "+sum);
		sc.close();
	}

}
