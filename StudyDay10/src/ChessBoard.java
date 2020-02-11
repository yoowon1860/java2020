//백준 1018번
//보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8*8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 
//당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
//첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 
//둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
public class ChessBoard {

	public static void main(String[] args) {

		int N = (int)(Math.random()*43+8);
		int M = (int)(Math.random()*43+8);
		System.out.println(N+" "+M);
		char [][] arr = new char [N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int a = (int)(Math.random()*2);
				if(a<1) arr[i][j] = 'B';
				else arr[i][j] = 'W';
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		for (int i = 0; i < N-8; i++) {
			for (int j = 0; j < M-8; j++) {
				
			}
		}
		
	}

}
