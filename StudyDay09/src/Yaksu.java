import java.util.Scanner;

//백준 1037번 
//	문제
//	양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 
//	어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
public class Yaksu {	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("약수의 갯수: ");
	int N = sc.nextInt();
	int [] arr = new int[N];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(arr[0]*arr[N-1]);
	
}
}
