import java.util.Scanner;

public class B1000 {
	
	

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int total = 0;
		for (int i = 0; i < 2; i++) {
			System.out.print((i+1)+"번째 수를 입력하세요");
			int a = sc.nextInt();
			if(a<10 && a>0)
				total+=a;
		}
		System.out.println(total);
	}

}
