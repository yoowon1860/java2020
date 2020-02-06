import java.util.Scanner;
//백준 1001번
//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오. 
public class Minus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int minus = A-B;
		System.out.println(minus);
	}

}
