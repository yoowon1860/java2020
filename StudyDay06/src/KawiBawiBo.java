import java.util.Scanner;


public class KawiBawiBo {

	public void Battle(int k/*플레이어의 입력 값, 가위(1), 바위(2), 보(3)*/) {
		int n = (int)(Math.random()*3 + 1); //컴퓨터의 임의 값
		if(k==1) {
			if(n==1) {
				System.out.println("철수(가위) : 컴퓨터(가위)");
				System.out.println("비겼습니다.");
			}else if(n==2) {
				System.out.println("철수(가위) : 컴퓨터(바위)");
				System.out.println("졌습니다.");
			}else if(n==3) {
				System.out.println("철수(가위) : 컴퓨터(보)");
				System.out.println("이겼습니다.");
			}
		}else if(k==2) {
			if(n==1) {
				System.out.println("철수(바위) : 컴퓨터(가위)");
				System.out.println("이겼습니다.");
			}else if(n==2) {
				System.out.println("철수(바위) : 컴퓨터(바위)");
				System.out.println("비겼습니다.");
			}else if(n==3) {
				System.out.println("철수(바위) : 컴퓨터(보)");
				System.out.println("졌습니다.");
			}
		}else if(k==3) {
			if(n==1) {
				System.out.println("철수(보) : 컴퓨터(가위)");
				System.out.println("졌습니다.");
			}else if(n==2) {
				System.out.println("철수(보) : 컴퓨터(바위)");
				System.out.println("이겼습니다.");
			}else if(n==2) {
				System.out.println("철수(보) : 컴퓨터(보)");
				System.out.println("비겼습니다.");
			}
		}

	}

	public static void main(String[] args) { 	

		Scanner sc = new Scanner(System.in);  
		KawiBawiBo kbb = new KawiBawiBo();
		boolean flag = true;
		while(flag) {
			System.out.println("철수[가위(1), 바위(2), 보(3), 끝내기(4)] >>");
			int k = sc.nextInt();
			switch (k) {
			case 1:
				kbb.Battle(1);

				break;
			case 2:
				kbb.Battle(2);

				break;
			case 3:
				kbb.Battle(3);

				break;
			case 4:
				System.out.println("게임이 종료됩니다.");
				flag = false;
				break;

			default:
				System.out.println("숫자를 잘못입력하였습니다.");
				break;
			}



		}
	}
}
