import java.util.Scanner;
import java.util.StringTokenizer;

public class EmptyScanner02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">> ");
			String a = sc.nextLine();
			if(a.equals("그만"))
				break;
			StringTokenizer st = new StringTokenizer(a, " ");
			int count = st.countTokens();
			System.out.println("어절의 개수는 "+ count);

		}
	}
}
