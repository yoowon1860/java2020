import java.util.Scanner;

public class Turret { //백준 1002번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, 
		  r1, r2는 10,000보다 작거나 같은 자연수이다.*/
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		int x3, y3;
		int count = 0;
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			count = -1;
		}
		for(x3=-10000;x3<10000;x3++) {
			for(y3=-10000;y3<10000;y3++)
		if(r1 == Math.abs(x1 - x3)+Math.abs(y1 - y3) && r2 == Math.abs(x2 - x3)+Math.abs(y2 - y3))
			count++;
		}
		System.out.println(count);
	}

}
