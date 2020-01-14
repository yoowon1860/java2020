import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("나뉨수를 입력하시오: ");
			int dividend = scanner.nextInt();
			System.out.println("나눗수를 입력하시오: ");
			int divisor = scanner.nextInt();
			try {
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+
						dividend/divisor+"입니다.");
				break;
			} catch (Exception e) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력하시오.");
			}
		}
		scanner.close();
	}

}
