import java.util.Scanner;

//백준 1010번
//(N ≤ M)
//재원이는 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다. (이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다.) 
//재원이는 다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다. 
//다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라.
public class BridgeMake {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count =0;
		while(a>count) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int [][] arr = new int [A+1][B+1];
			for (int i = 0; i <= B; i++)
				arr[1][i] = i;
			for (int i = 2; i <= A; i++) {
				for (int j = i; j <= B; j++) {
					for (int k = j; k >=i; k--) {
						arr[i][j] +=arr[i-1][k-1];
					}
				}
			}
			System.out.println(arr[A][B]);
			count++;
		}
		sc.close();
	}

}
