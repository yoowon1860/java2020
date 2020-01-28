import java.util.Scanner;

public class EmptyScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int count = 0;
			System.out.println(">>");
			String s = sc.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String a[] = s.split(" ");
			System.out.println("어절 개수는"+a.length);
			
			}
		}
	}


