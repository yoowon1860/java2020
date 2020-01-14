import java.util.Scanner;

public class ScannerEnglishPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String text = sc.next();
		char c = text.charAt(0);

		for(char j=c;j>='a';j--) {
			for(char i ='a'; i<=j;i++) {
				System.out.print(i);
				
			}
			System.out.println();
		}
	}

}
