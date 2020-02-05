import java.util.Scanner;

public class Fibonacci { //백준 1003번
	int countZ, countO;
	public int fibonacci(int n) {
		if(n==0) {
			countZ++;
			return 0;
		}else if(n==1) {
			countO++;
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i =0; i<a; i++) {
			Fibonacci f = new Fibonacci();
			int c = sc.nextInt();
			f.fibonacci(c);
			System.out.println(c+" "+f.countZ+" "+f.countO);
		}
		
		sc.close();
		
	}

}
