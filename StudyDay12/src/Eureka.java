import java.util.Scanner;
//백준 10448번 문제
//“Eureka! num = Δ + Δ + Δ” 라고 적은것에서 유레카 이론으로 알려졌다.
//꿍은 몇몇 자연수가 정확히 3개의 삼각수의 합으로 표현될 수 있는지 궁금해졌다.
//위의 예시에서, 5와 10은 정확히 3개의 삼각수의 합으로 표현될 수 있지만 4와 6은 그렇지 않다.
//자연수가 주어졌을 때, 그 정수가 정확히 3개의 삼각수의 합으로 표현될 수 있는지 없는지를 판단해주는 프로그램을 만들어라.
//단, 3개의 삼각수가 모두 달라야 할 필요는 없다.
public class Eureka {
	static int hap(int n) {
		int total =0;
		for (int i = 1; i <=n ; i++) {
			total+=i;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int [] arr = new int[A];
		for (int i = 0; i < A; i++) {
			arr[i] = sc.nextInt();
		}
		int i =0;

		while(i<A) {
			boolean flag = false;
			a: for (int l = 1; l < 50; l++) {
				for (int j = 1; j <50 ; j++) {
					for (int k = 1; k < 50; k++) {
						if(arr[i]==hap(l)+hap(j)+hap(k)) {
							flag = false;
							System.out.println("1");
							break a;
						}else
							flag = true;
					}
				}
			}
			if(flag)
				System.out.println("0");
			i++;
		}
	}
}